package de.demmer.dennis.snake;

import de.demmer.dennis.snake.configuration.SnakeConfig;
import de.demmer.dennis.snake.gamefield.Board;

/**
 * The main entry point of the Snake game. 
 * @author Dennis
 *
 */
public class Application {
	
	public static void main(String[] args) {
		Board b = new Board(SnakeConfig.BOARD_SIZE);
		
		while(true) {
			try {
				Thread.sleep(SnakeConfig.GAME_SPEED);
				b.redrawBoard();
				b.update();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}

}
