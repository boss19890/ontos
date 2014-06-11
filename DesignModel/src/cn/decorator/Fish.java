package cn.decorator;

/**
 * 鱼儿
 * 【具体装饰角色】
 */
public class Fish extends Change {
	public Fish(TheGreatestSage sage) {
		super(sage);
		// TODO Auto-generated constructor stub
	}
	
	public void move(){
		//首先运行抽象装饰角色（change）的功能
		super.move();
		System.out.println("Fish Move!");
	}

}
