package de.demmer.dennis.snake.entity;


import java.awt.Color;

import de.demmer.dennis.snake.configuration.SnakeConfig;

public class TailFragment extends Block{

	public TailFragment(int blockY, int blockX, Color tailColor) {
		super(blockY, blockX, SnakeConfig.TAIL_COLOR);
	}


	
	

}
