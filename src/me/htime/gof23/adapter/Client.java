package me.htime.gof23.adapter;

/**
 * 
 * @author nemowen
 *
 */
public class Client {

	public static void main(String[] args) {
		MacBook mb = new MacBook();
		
		PS2Keybord ps2 = new PS2Keybord();
		
		PS2ToUsbAdapter adapter = new PS2ToUsbAdapter(ps2);
		
		mb.type(adapter);
	}

}
