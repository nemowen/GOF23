package me.htime.gof23.flyweight;

/**
 * 享元类接口
 * @author nemowen
 *
 */
public interface IChessFlyWeight {
	void setColor(String c);
	String getColor();
	void display(Point p);
}
