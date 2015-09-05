package me.htime.gof23.state;

// 被预定了的房间状态处理类
public class RoomBookedState implements IRoomState {

	@Override
	public void handle() {
		System.out.println("房间被人预定,不能再预定了");
	}

}
