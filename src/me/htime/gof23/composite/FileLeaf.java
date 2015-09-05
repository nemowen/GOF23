package me.htime.gof23.composite;

public class FileLeaf implements IFileComponent {
	
	private String name;

	public FileLeaf(String name) {
		this.name = name;
	}

	@Override
	public void checkFile() {
		System.out.println("正在检查["+this.name+"]文件");
	}

}

class VideoLeaf implements IFileComponent{
	private String name;

	public VideoLeaf(String name) {
		this.name = name;
	}
	@Override
	public void checkFile() {
		System.out.println("正在检查["+this.name+"]视频文件");
		
	}

}