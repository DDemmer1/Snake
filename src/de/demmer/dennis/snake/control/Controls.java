package de.demmer.dennis.snake.control;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Controls implements KeyListener{

	@Override
	public void keyTyped(KeyEvent e) {
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		
		
		if(e.getKeyCode() == 87) {
			System.out.println("Nach oben");
		}
		
		if(e.getKeyCode() == 65) {
			System.out.println("Nach links");
		}
		
		if(e.getKeyCode() == 83) {
			System.out.println("Nach unten");
		}
		
		if(e.getKeyCode() == 68) {
			System.out.println("Nach rechts");
		}
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		
	}

}
