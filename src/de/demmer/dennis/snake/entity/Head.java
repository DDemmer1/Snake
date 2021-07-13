package de.demmer.dennis.snake.entity;

import java.awt.Color;

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
