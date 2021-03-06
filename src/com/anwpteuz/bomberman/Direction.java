package com.anwpteuz.bomberman;


public enum Direction {
	
	LEFT(-1, 0),
	RIGHT(1, 0),
	UP(0, -1),
	DOWN(0, 1);
	
	private final int x, y;
	public static final Direction[] directions = new Direction[] {
		Direction.LEFT,
		Direction.RIGHT,
		Direction.UP,
		Direction.DOWN
	};
	
	Direction(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
	
	
	/**
	 * 
	 * @return Returns the inverse to the direction.
	 */
	public Direction getInverse() {
		switch(this) {
		case LEFT: return RIGHT;
		case RIGHT: return LEFT;
		case UP: return DOWN;
		case DOWN: return UP;
		}
		return null;
	}
}
