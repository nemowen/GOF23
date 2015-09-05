package me.htime.gof23.flyweight;

public class Client {

	public static void main(String[] args) {
		IChessFlyWeight chess = ChessFlyWeightFactory.getChess("黑色");
		chess.display(new Point(20,10));
		chess.display(new Point(50,90));
		
		IChessFlyWeight chess2 = ChessFlyWeightFactory.getChess("白色");
		chess2.display(new Point(50,10));
		chess2.display(new Point(60,90));
	}

}
