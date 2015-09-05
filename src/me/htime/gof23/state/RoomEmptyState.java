package me.htime.gof23.state;

// 空房间的状态处理类
public class RoomEmptyState implements IRoomState {

	@Override
	public void handle() {
		System.out.println("房间没有人住,可以预定");
	}

}
