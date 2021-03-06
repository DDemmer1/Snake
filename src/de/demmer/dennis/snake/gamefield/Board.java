package de.demmer.dennis.snake.gamefield;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import de.demmer.dennis.snake.configuration.SnakeConfig;
import de.demmer.dennis.snake.control.Controls;
import de.demmer.dennis.snake.entity.Apple;
import de.demmer.dennis.snake.entity.Block;
import de.demmer.dennis.snake.entity.Head;
import de.demmer.dennis.snake.entity.Tail;
import de.demmer.dennis.snake.entity.TailFragment;

public class Board extends JFrame {

	private int size;
	private Grid grid;
	private Head head;
	private Tail tail;
	private int score;

	public Board(int size) {
		this.size = size;
		head = new Head(SnakeConfig.START_Y, SnakeConfig.START_X);
		tail = new Tail();
		score = 0;
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
		
		grid.spawnApple();
		
	}

	public void redrawBoard() {
		getContentPane().removeAll();

		// add all Blocks again
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				add(grid.getBlockGrid()[i][j]);
			}
		}
		revalidate();
	}

	
	
	public void update() {

		// Move head
		head.move();
		
		collisionCheck();
		
		//Set head in grid
		grid.setBlockAt(head.getBlockX(), head.getBlockY(), head);
		

		// Add tailFragment to tail
		TailFragment tailFrag = new TailFragment(head.getLastY(), head.getLastX(), SnakeConfig.TAIL_COLOR);
		tail.getTailQueue().add(tailFrag);

		// update grid with new tailFrag
		grid.setBlockAt(head.getLastX(), head.getLastY(), tailFrag);
				
		// if max tail size is reached -> remove last tailFrag and replace with block
		if (tail.getMaxTailSize() <= tail.getTailQueue().size()) {
			TailFragment lastTailFrag = tail.getTailQueue().poll();
			Block emptyBlock = new Block(lastTailFrag.getBlockY(), lastTailFrag.getBlockX(), SnakeConfig.BLOCK_COLOR);
			grid.setBlockAt(lastTailFrag.getBlockX(), lastTailFrag.getBlockY(), emptyBlock);
		}
	}

	private void collisionCheck() {
		
		Block blockToCheck = grid.getBlockAt(head.getBlockX(), head.getBlockY());
		
		if(blockToCheck instanceof TailFragment) {
			JOptionPane.showMessageDialog(null, "GAME OVER - SCORE: " + score);
			System.exit(0);
		} else if(blockToCheck instanceof Apple) {
			score = score + 10;
			tail.setMaxTailSize(tail.getMaxTailSize()+5);
			SnakeConfig.GAME_SPEED = SnakeConfig.GAME_SPEED-5;
			grid.spawnApple();
		}
		
		
		
	}


}
