package cn.decorator;

/**
 * ���
 * ������װ�ν�ɫ��
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
