package me.htime.gof23.prototype;

import java.io.Serializable;
import java.util.Date;

/**
 * 通过序列化的方法进行深复制
 * @author nemowen
 *
 */
public class Sheep2 implements Cloneable, Serializable{
	private String name;
	private Date data;
	
	
	public Sheep2(String name, Date data) {
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
		return super.clone();
	}
	
	
	
	
}
