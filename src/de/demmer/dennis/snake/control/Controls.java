package de.demmer.dennis.snake.control;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import de.demmer.dennis.snake.entity.Head;
import de.demmer.dennis.snake.entity.Head.HeadDirection;

public class Controls implements KeyListener {

	@Override
	public void keyTyped(KeyEvent e) {

	}

	@Override
	public void keyPressed(KeyEvent e) {

		if (e.getKeyCode() == 87) {
			System.out.println("Nach oben");
			if (Head.direction != HeadDirection.DOWN) {
				Head.direction = HeadDirection.UP;
			}
		}

		if (e.getKeyCode() == 65) {
			System.out.println("Nach links");
			if (Head.direction != HeadDirection.RIGHT) {
				Head.direction = HeadDirection.LEFT;
			}

		}

		if (e.getKeyCode() == 83) {
			System.out.println("Nach unten");
			if (Head.direction != HeadDirection.UP) {
				Head.direction = HeadDirection.DOWN;
			}

		}

		if (e.getKeyCode() == 68) {
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
