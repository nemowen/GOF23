package me.htime.gof23.prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;

/**
 * 以下进行序列化进行深复制
 * 请观察打印时间的变化
 * @author nemowen
 *
 */
public class Client2 {

	public static void main(String[] args) throws Exception {
		Date date = new Date(2348729384723L);
		Sheep2 sheep = new Sheep2("多利",date);
		
		// 以下进行序列化进行深复制
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		ObjectOutputStream oos = new ObjectOutputStream(bos);
		oos.writeObject(sheep);
		
		byte[] b = bos.toByteArray();
		ByteArrayInputStream bis = new ByteArrayInputStream(b);
		ObjectInputStream ois = new ObjectInputStream(bis);
		Sheep2 sheep2 = (Sheep2)ois.readObject();
		
		System.out.println(sheep.getName());
		System.out.println(sheep.getData());
		
		date.setTime(21321312312L);
		
		System.out.println("修改时间后:"+sheep.getData());
		
		sheep2.setName("少利");
		System.out.println(sheep2.getName());
		System.out.println(sheep2.getData());
		
	}

}
