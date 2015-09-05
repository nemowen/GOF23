package me.htime.gof23.adapter;

// 这里使用了对象适配器方式,也可以使用继承方式实现,但推荐使用对象方式.
public class PS2ToUsbAdapter implements IAdapter {

	private PS2Keybord ps2;
	
	public PS2ToUsbAdapter(PS2Keybord ps2) {
		this.ps2 = ps2;
	}

	@Override
	public void usbReceiveData() {
		ps2.typeWord();
	}

}
