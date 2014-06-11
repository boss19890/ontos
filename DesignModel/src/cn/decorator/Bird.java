package cn.decorator;

/**
 * 鸟儿
 * 【具体装饰角色】
 */
public class Bird extends Change {
	public Bird(TheGreatestSage sage) {
		super(sage);
		// TODO Auto-generated constructor stub
	}

	public void move() {
		super.move();
		System.out.println("Bird Move");
	}
}
