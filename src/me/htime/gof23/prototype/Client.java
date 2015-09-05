package me.htime.gof23.prototype;

import java.util.Date;

/**
 * 通过属性复制的方式来进行深复制
 * @author nemowen
 *
 */
public class Client {

	public static void main(String[] args) throws CloneNotSupportedException {
		Date date = new Date(2348729384723L);
		Sheep sheep = new Sheep("多利",date);
		Sheep sheep2 = (Sheep) sheep.clone(); 
		System.out.println(sheep.getName());
		System.out.println(sheep.getData());
		
		date.setTime(21321312312L);
		
		System.out.println(sheep.getData());
		
		sheep2.setName("少利");
		System.out.println(sheep2.getName());
		System.out.println(sheep2.getData());
		
	}

}
