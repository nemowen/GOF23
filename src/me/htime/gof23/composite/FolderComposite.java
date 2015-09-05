package me.htime.gof23.composite;

import java.util.ArrayList;
import java.util.List;

public class FolderComposite implements IFileComponent {
	
	private String name;
	private List<IFileComponent> files = new ArrayList<IFileComponent>();

	public FolderComposite(String name) {
		super();
		this.name = name;
	}

	public void add(IFileComponent file){
		files.add(file);
	}
	
	public void remove(int index){
		files.remove(index);
	}
	
	@Override
	public void checkFile() {
		System.out.println("正在检查["+this.name+"]文件夹");
		for(IFileComponent file : files){
			file.checkFile();
		}
	}

}
