package me.htime.gof23.memento;

public class Client {
	public static void main(String[] args) {
		CareTaker ct = new CareTaker();
		Emp emp = new Emp("nemo",20,1000);
		ct.push(emp.memento());
		
		System.out.println(emp);
		
		
		emp.setAge(18);
		emp.setName("nora");
		
		System.out.println(emp);
		
		emp.recover(ct.pop());
		
		System.out.println(emp);
	}
}
