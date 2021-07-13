package de.demmer.dennis.snake.gamefield;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JFrame;

import de.demmer.dennis.snake.control.Controls;
import de.demmer.dennis.snake.entity.Block;
import de.demmer.dennis.snake.entity.Head;

public class Board extends JFrame {

	private int size;
	private Grid grid;
	private Head head;

	public Board(int size) {
		this.size = size;
		head = new Head(0,0);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		setSize(new Dimension(size * 40, size * 40));
		setLocationRelativeTo(null);
		setLayout(new GridLayout(size, size));
		getContentPane().setBackground(Color.black);
		addKeyListener(new Controls());
		setResizable(false);
		initGrid();
		revalidate();
		pack();

	}

	private void initGrid() {
		grid = new Grid(size);
		grid.getBlockGrid()[head.getBlockY()][head.getBlockX()] = head;
		
		// add all Blocks to the JFrame
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				add(grid.getBlockGrid()[i][j]);
			}
		}
	}

	
	public void redrawBoard() {
		getContentPane().removeAll();
		
		//add all Blocks again
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				add(grid.getBlockGrid()[i][j]);
			}
		}
		
		revalidate();
	}
	
	
	public void update() {
		
		//Move head
		head.move();
		grid.setBlockAt(head.getBlockX(), head.getBlockY(), head);
		Block greenBlock = new Block(head.getLastX(),head.getLastY(), Color.GREEN);
		grid.setBlockAt(head.getLastX(), head.getLastY(), greenBlock);
		
	}
	

	

}
