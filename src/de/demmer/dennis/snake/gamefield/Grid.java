package de.demmer.dennis.snake.gamefield;

import java.awt.Color;
import java.util.Random;

import de.demmer.dennis.snake.configuration.SnakeConfig;
import de.demmer.dennis.snake.entity.Apple;
import de.demmer.dennis.snake.entity.Block;
import de.demmer.dennis.snake.entity.Head;
import de.demmer.dennis.snake.entity.TailFragment;

/**
 * Grid system in which the player is moving and the apples spawn.
 * The data structure which this system builds on is a 2D-Array of {@link Block} 
 * 
 * @author Dennis
 *
 */
public class Grid {

	private Block[][] blockGrid;

	private int size;

	public Block[][] getBlockGrid() {
		return blockGrid;
	}

	public void setBlockGrid(Block[][] blockGrid) {
		this.blockGrid = blockGrid;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	/**
	 * Initializes a 2D-Array of {@link Block}
	 * 
	 * @param size Determines the height and the width of the 2D Array
	 */
	public Grid(int size) {
		this.size = size;
		blockGrid = new Block[size][size];
		
		//iterate over 2D-Array
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				//add new Block
				blockGrid[i][j] = new Block(j, i, SnakeConfig.BLOCK_COLOR);
			}
		}
	}

	/**
	 * Utility method to display the coordinates of all Blocks in the console
	 */
	public void printGrid() {
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				System.out.print(blockGrid[i][j]);
			}
			System.out.println();
		}
	}
	
	
	public Block getBlockAt(int x, int y) {
		return blockGrid[y][x];
	}
	
	public void setBlockAt(int x, int y, Block block) {
		blockGrid[y][x] = block;
	}

	public void spawnApple() {
		
		Random rnd = new Random();
		int rndY = rnd.nextInt(SnakeConfig.BOARD_SIZE);
		int rndX = rnd.nextInt(SnakeConfig.BOARD_SIZE);
		
		while(!isFreeBlock(rndX, rndY)) {
			rndY = rnd.nextInt(SnakeConfig.BOARD_SIZE);
			rndX = rnd.nextInt(SnakeConfig.BOARD_SIZE);
		}
		
		
		setBlockAt(rndX, rndY, new Apple(rndY, rndX));
		
		
		
		
	}
	
	private boolean isFreeBlock(int x, int y) {
		
		if(getBlockAt(x, y) instanceof Head) {
			return false;
		} else if(getBlockAt(x, y) instanceof TailFragment) {
			return false;
		}
		
		return true;
	}
	
	
	

}
