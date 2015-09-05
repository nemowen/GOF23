package me.htime.gof23.template_method;

public abstract class BankTemplateMethod {
	
	private void queue(){
		System.out.println("排队取号");
	}
	
	// 交给子类去实现
	public abstract void translate();
	
	private void mark(){
		System.out.println("业务完成, 请给我评分!");
	}
	
	// 模版方法
	public final void process(){
		this.queue();
		
		// 钩子方法, 调用子类具体的实现
		this.translate();
		
		this.mark();
	}

}
