package de.demmer.dennis.snake.gamefield;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JFrame;

public class Board extends JFrame {

	private int size;
	private Grid grid;

	public Board(int size) {
		this.size = size;
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		setSize(new Dimension(size * 40, size * 40));
		setLocationRelativeTo(null);
		setLayout(new GridLayout(size, size));
		initGrid();
		revalidate();

	}

	private void initGrid() {
		grid = new Grid(size);
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				add(grid.getBlockGrid()[i][j]);
			}
		}
	}
	
	


}
