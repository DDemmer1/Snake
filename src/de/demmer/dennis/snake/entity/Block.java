package de.demmer.dennis.snake.entity;

import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.border.LineBorder;

/**
 * Parent class of all entities on the board.
 * Extends a {@link JPanel} to be displayable in a JFrame
 * 
 * @author Dennis
 *
 */
public class Block extends JPanel {

	private int blockX;
	private int blockY;

	public Block(int blockY, int blockX, Color color) {
		super();
		this.blockX = blockX;
		this.blockY = blockY;
		setBackground(color);
		setBorder(new LineBorder(Color.BLACK));
	}

	public int getBlockX() {
		return blockX;
	}

	public void setBlockX(int blockX) {
		this.blockX = blockX;
	}

	public int getBlockY() {
		return blockY;
	}

	public void setBlockY(int blockY) {
		this.blockY = blockY;
	}

	@Override
	public String toString() {
		return "Block [x=" + blockX + ", y=" + blockY + "]";
	}

}
