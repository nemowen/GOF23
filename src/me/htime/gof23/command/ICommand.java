package me.htime.gof23.command;

/**
 * 命令接口
 * @author nemowen
 *
 */
public interface ICommand {
	/**
	 * 在实际项目中,可以根据业务的需求,设计不同的方法跟参数
	 */
	void execute();
}
