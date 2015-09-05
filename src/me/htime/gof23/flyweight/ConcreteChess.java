package me.htime.gof23.flyweight;

/**
 * 真实棋子
 * @author nemowen
 *
 */
class ConcreteChess implements IChessFlyWeight{
	
	// 内部状态 颜色共享
	private String color;

	public ConcreteChess(String color) {
		super();
		this.color = color;
	}

	@Override
	public void setColor(String c) {
		this.color = c;
	}

	@Override
	public String getColor() {
		return this.color;
	}

	/**
	 * 传入外部状态 坐标
	 */
	@Override
	public void display(Point p) {
		System.out.println("棋子颜色:"+this.color);
		System.out.println("棋子位置:"+p.getX()+"---"+p.getY());
	}
	
}