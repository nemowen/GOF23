package me.htime.gof23.flyweight;

/**
 * 外部状态对象 
 * @author nemowen
 *
 */
public class Point {
	private int x,y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public Point() {
		super();
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
}
