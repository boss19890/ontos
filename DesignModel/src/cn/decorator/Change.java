package cn.decorator;

/**
 * 七十二变
 * 【抽象装饰角色】
 */
public abstract class Change implements TheGreatestSage {
	private TheGreatestSage sage;
	//设置抽象构建
	public Change(TheGreatestSage sage){
		this.sage=sage;
	}
	@Override
	public void move() {
		// TODO Auto-generated method stub
		if(this.sage!=null)
			sage.move();
	}
}
