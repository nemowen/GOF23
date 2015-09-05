package me.htime.gof23.singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;

/**
 * 1.通过反射，破解单例模式，生成多个对象，
 * 2.以及防止破解解决方案
 * @author nemowen
 *
 */
public class Client {

	public static void main(String[] args) throws Exception {
		SingletonDemo06 s1 = SingletonDemo06.getInstance();
		SingletonDemo06 s2 = SingletonDemo06.getInstance();
		
		System.out.println(s1);
		System.out.println(s2);
		
		// 1.通过直接调用间单例的私用构造函数来破解单例,以及防破解
//		Class<SingletonDemo06> clazz = (Class<SingletonDemo06>) Class.forName("me.htime.gof23.singleton.SingletonDemo06");
//		Constructor<SingletonDemo06> c = clazz.getDeclaredConstructor();
//		c.setAccessible(true);
//		SingletonDemo06 s3 = c.newInstance();
//		SingletonDemo06 s4 = c.newInstance();
//		System.out.println(s3);
//		System.out.println(s4);
		
		// 2.通过反序列化来破解单例，以及防破解,在
		FileOutputStream fos = new FileOutputStream("C:/Users/nemowen/temp/temp.obj");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(s1);
		oos.close();
		fos.close();
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:/Users/nemowen/temp/temp.obj"));
		SingletonDemo06 s3 = (SingletonDemo06)ois.readObject();
		System.out.println(s3);

	}

}
