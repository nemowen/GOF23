package me.htime.gof23.state;

public class Client {
	public static void main(String[] args) {
		RoomContent room = new RoomContent();
		room.setState(new RoomEmptyState());
		
		room.setState(new RoomCheckedInState());
	}
}
