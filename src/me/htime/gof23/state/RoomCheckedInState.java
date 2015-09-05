package me.htime.gof23.state;

// 入住了的房间状态处理类
public class RoomCheckedInState implements IRoomState {

	@Override
	public void handle() {
		System.out.println("房间入住,不能再预定了");
	}

}
