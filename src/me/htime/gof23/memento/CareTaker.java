package me.htime.gof23.memento;

import java.util.Stack;

public class CareTaker {
	
	public Stack<EmpTemp> stack = new Stack<EmpTemp>();
	
	public void push(EmpTemp o){
		stack.push(o);
	}
	
	public EmpTemp get(int index){
		return stack.get(index);
	}
	
	public EmpTemp pop(){
		return stack.pop();
	}

}
