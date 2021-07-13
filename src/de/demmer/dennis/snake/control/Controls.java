package de.demmer.dennis.snake.control;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import de.demmer.dennis.snake.configuration.SnakeConfig;
import de.demmer.dennis.snake.entity.Head;
import de.demmer.dennis.snake.entity.Head.HeadDirection;

public class Controls implements KeyListener {

	@Override
	public void keyTyped(KeyEvent e) {

	}

	@Override
	public void keyPressed(KeyEvent e) {

		if (e.getKeyCode() == SnakeConfig.KEY_CODE_UP) {
			System.out.println("Nach oben");
			if (Head.direction != HeadDirection.DOWN) {
				Head.direction = HeadDirection.UP;
			}
		}

		if (e.getKeyCode() == SnakeConfig.KEY_CODE_LEFT) {
			System.out.println("Nach links");
			if (Head.direction != HeadDirection.RIGHT) {
				Head.direction = HeadDirection.LEFT;
			}

		}

		if (e.getKeyCode() == SnakeConfig.KEY_CODE_DOWN) {
			System.out.println("Nach unten");
			if (Head.direction != HeadDirection.UP) {
				Head.direction = HeadDirection.DOWN;
			}

		}

		if (e.getKeyCode() == SnakeConfig.KEY_CODE_RIGHT) {
			System.out.println("Nach rechts");
			if (Head.direction != HeadDirection.LEFT) {
				Head.direction = HeadDirection.RIGHT;
			}
		}

	}

	@Override
	public void keyReleased(KeyEvent e) {

	}

}
