package me.htime.gof23.bridge;

/**
 * 桥接模式：按不类型来分产品的时候，如下：
 * 按品牌分: 联想，三星，华为
 * 按产品类型分，如：电脑，手机，Ipod,
 * @author nemowen
 *
 */
public class Client {

	public static void main(String[] args) {
		
		IComputer computer = new LenovoComputer(new LenovoBrand());
		computer.sale();

		IComputer c2 = new Computer(new ViewSonicBrand());
		c2.sale();
	}

}
