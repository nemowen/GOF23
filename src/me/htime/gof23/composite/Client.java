package me.htime.gof23.composite;

/**
 * 组合模式，经常应用于 树形结构的处理
 * @author nemowen
 *
 */
public class Client {
	public static void main(String[] args) {
		IFileComponent f1,f2,f3,f4;
		f1 = new FileLeaf("测试文件");
		f2 = new VideoLeaf("龙之谷");
		f3 = new FileLeaf("英语的时态");
		f4 = new VideoLeaf("变形金刚");
		FolderComposite f = new FolderComposite("我的文档");
		f.add(f2);
		f.add(f3);
		f.add(f1);
		
		f4.checkFile();
		f.checkFile();
		
	}
}
