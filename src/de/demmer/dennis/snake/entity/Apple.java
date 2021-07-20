package de.demmer.dennis.snake.entity;


import de.demmer.dennis.snake.configuration.SnakeConfig;

public class Apple extends Block{

	public Apple(int blockY, int blockX) {
		super(blockY, blockX, SnakeConfig.APPLE_COLOR);
	}

}
