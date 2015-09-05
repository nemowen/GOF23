package me.htime.gof23.prototype;

import java.util.Date;

/**
 * 在复盖的clone方法中,通过属性复制的方式来进行深复制
 * @author nemowen
 *
 */
public class Sheep implements Cloneable{
	private String name;
	private Date data;
	
	
	public Sheep(String name, Date data) {
		super();
		this.name = name;
		this.data = data;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Sheep sheep = (Sheep)super.clone();
		// 属于进行深复制
		sheep.data = (Date) this.data.clone();
		return sheep;
	}
	
	
	
	
}
