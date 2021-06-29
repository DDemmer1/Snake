package de.demmer.dennis.snake.gamefield;

import java.awt.Color;

import de.demmer.dennis.snake.entity.Block;

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

	public Grid(int size) {
		this.size = size;
		blockGrid = new Block[size][size];
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				blockGrid[i][j] = new Block(j, i, Color.BLUE);
			}
		}

	}

	public void printGrid() {
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				System.out.print(blockGrid[i][j]);
			}
			System.out.println();
		}
	}

}
