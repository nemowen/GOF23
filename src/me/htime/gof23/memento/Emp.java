package me.htime.gof23.memento;

public class Emp {

	private String name;
	private int age;
	private double salary;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Emp(String name, int age, double salary) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	
	public EmpTemp memento(){
		return new EmpTemp(this);
	}
	
	public void recover(EmpTemp e){
		this.name = e.getName();
		this.age = e.getAge();
		this.salary = e.getSalary();
	}
	
	@Override
	public String toString() {
		return "name:"+name+"---age:"+age+"---salar:"+salary;
	}
	
}
