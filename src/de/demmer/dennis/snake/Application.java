package de.demmer.dennis.snake;

import de.demmer.dennis.snake.gamefield.Board;

/**
 * The main entry point of the Snake game. 
 * @author Dennis
 *
 */
public class Application {
	
	public static void main(String[] args) {
		Board b = new Board(50);
		
		while(true) {
			try {
				Thread.sleep(150);
				b.redrawBoard();
				b.update();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}

}
