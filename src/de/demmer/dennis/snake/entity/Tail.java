package de.demmer.dennis.snake.entity;

import java.util.LinkedList;
import java.util.Queue;

import de.demmer.dennis.snake.configuration.SnakeConfig;

public class Tail {
	
	private Queue<TailFragment> tailQueue;
	
	private int tailSize;
	
	
	public Tail() {
		tailQueue = new LinkedList<TailFragment>();
		tailSize = SnakeConfig.TAIL_START_SIZE;
	}
	

	public Queue<TailFragment> getTailQueue() {
		return tailQueue;
	}

	public void setTailQueue(Queue<TailFragment> tailQueue) {
		this.tailQueue = tailQueue;
	}

	public int getTailSize() {
		return tailSize;
	}

	public void setTailSize(int tailSize) {
		this.tailSize = tailSize;
	}
	
	
	
	

}
