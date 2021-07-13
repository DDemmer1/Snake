package de.demmer.dennis.snake.gamefield;

import java.awt.Color;

import de.demmer.dennis.snake.entity.Block;

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
				blockGrid[i][j] = new Block(j, i, Color.BLUE);
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
	
	
	
	
	

}
