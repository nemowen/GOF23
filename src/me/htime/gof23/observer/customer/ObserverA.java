package me.htime.gof23.observer.customer;

public class ObserverA implements IObserver {
	
	private int state;

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}

	@Override
	public void notify(SuperSubject ss) {
		if(ss instanceof ConcrateSubject){
			this.state = ((ConcrateSubject)ss).getState();
			System.out.println("ObserverA receive state:"+this.state);
		}

	}

}
