package me.htime.gof23.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * 享元工厂
 * @author nemowen
 *
 */
public class ChessFlyWeightFactory {
	private static Map<String,IChessFlyWeight> map = new HashMap<String,IChessFlyWeight>();
	
	private ChessFlyWeightFactory() {
	}

	public static IChessFlyWeight getChess(String color){
		IChessFlyWeight chess = (IChessFlyWeight)map.get(color);
		if(chess==null){
			chess = new ConcreteChess(color);
			map.put(color, chess);
		}
		return chess;
	}
}
