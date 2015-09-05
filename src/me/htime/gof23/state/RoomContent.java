package me.htime.gof23.state;

// 状态模式 关键类
// 持有子类的引用, 这里统一切换房间的状态
public class RoomContent {
	
	IRoomState state;

	public void setState(IRoomState state) {
		this.state = state;
		this.state.handle();
	}
	

}
