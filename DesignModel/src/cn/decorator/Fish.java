package cn.decorator;

/**
 * ���
 * ������װ�ν�ɫ��
 */
public class Fish extends Change {
	public Fish(TheGreatestSage sage) {
		super(sage);
		// TODO Auto-generated constructor stub
	}
	
	public void move(){
		//�������г���װ�ν�ɫ��change���Ĺ���
		super.move();
		System.out.println("Fish Move!");
	}

}
