package com.dev2games.astar;
/**
 * Represents a point vector
 * @author Nelson Sanchez
 *
 */

public class Vector {
	
	int x;
	int y;
	
	/**
	 * Constructor
	 * @param x the x position
	 * @param y the y position
	 */
	
	public Vector(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	/**
	 * Gets the x position
	 * @return the x position
	 */
	
	public int getX() {
		return x;
	}
	
	/**
	 * Gets the y position
	 * @return the y position
	 */
	
	public int getY() {
		return y;
	}

}
