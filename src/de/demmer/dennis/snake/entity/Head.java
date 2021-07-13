package de.demmer.dennis.snake.entity;

import java.awt.Color;

import de.demmer.dennis.snake.configuration.SnakeConfig;

public class Head extends Block {

	public enum HeadDirection {
		UP, DOWN, LEFT, RIGHT
	}

	public static HeadDirection direction;

	private int lastX;
	private int lastY;

	public Head(int blockY, int blockX) {
		super(blockY, blockX, Color.RED);
		direction = HeadDirection.RIGHT;
	}

	public int getLastX() {
		return lastX;
	}

	public void setLastX(int lastX) {
		this.lastX = lastX;
	}

	public int getLastY() {
		return lastY;
	}

	public void setLastY(int lastY) {
		this.lastY = lastY;
	}

	@Override
	public void setBlockY(int blockY) {

		if (blockY < 0) {
			super.setBlockY(SnakeConfig.BOARD_SIZE - 1);
		} else if ( blockY > SnakeConfig.BOARD_SIZE - 1) {
			super.setBlockY(0);
		} else {
			super.setBlockY(blockY);
		}
	}
	
	@Override
	public void setBlockX(int blockX) {

		if (blockX < 0) {
			super.setBlockX(SnakeConfig.BOARD_SIZE - 1);
		} else if ( blockX > SnakeConfig.BOARD_SIZE - 1) {
			super.setBlockX(0);
		} else {
			super.setBlockX(blockX);
		}
	}
	
	

	public void move() {
		setLastX(getBlockX());
		setLastY(getBlockY());

		switch (direction) {
		case UP:
			setBlockY(getBlockY() - 1);
			break;
		case DOWN:
			setBlockY(getBlockY() + 1);
			break;
		case LEFT:
			setBlockX(getBlockX() - 1);
			break;
		case RIGHT:
			setBlockX(getBlockX() + 1);
			break;
		default:
			break;
		}

	}

}
