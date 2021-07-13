package de.demmer.dennis.snake.configuration;

import java.awt.Color;

import de.demmer.dennis.snake.entity.Head.HeadDirection;

public class SnakeConfig {
	
	public static final boolean DEBUG_GRID_BORDERS = false;
	
	public static final int TAIL_START_SIZE = 8;

	public static final int BOARD_SIZE = 50;
	
	//lower = faster
	public static int GAME_SPEED = 500;
	
	public static final Color BLOCK_COLOR = Color.BLACK;
	public static final Color HEAD_COLOR = Color.RED;
	public static final Color TAIL_COLOR = Color.GREEN;


	public static final int START_X = 10;
	public static final int START_Y = 10;
	public static final HeadDirection START_DIRECTION = HeadDirection.RIGHT;

	
	
	public static final int KEY_CODE_UP = 87;
	public static final int KEY_CODE_DOWN = 83;
	public static final int KEY_CODE_LEFT = 65;
	public static final int KEY_CODE_RIGHT = 68;

	
	//  Alternative arrow Key Codes
	//	37 -- Left
	//	38 -- Up
	//	39 -- Right
	//	40 -- Down

	
	
	
	
}
