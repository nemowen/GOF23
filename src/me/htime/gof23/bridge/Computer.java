package me.htime.gof23.bridge;

/**
 * 桥接
 * @author nemowen
 *
 */
public class Computer implements IComputer {
	
	IBrand brand;
	Computer(IBrand brand) {
		super();
		this.brand = brand;
	}

	@Override
	public void sale() {
		System.out.println(brand.brandName()+"电脑出售中...");
	}

}
