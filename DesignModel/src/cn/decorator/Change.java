package cn.decorator;

/**
 * ��ʮ����
 * ������װ�ν�ɫ��
 */
public abstract class Change implements TheGreatestSage {
	private TheGreatestSage sage;
	//���ó��󹹽�
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
