package kr.poly;

//�ܵ��� ����� �ϴ� ��ü ������ �Ұ����ϴ�.
//�߻�Ŭ����(�ҿ����Ѱ�ü, ��ְ�ü) --> Animal ani = new Animal();
public abstract class Animal extends Object {

	//Dog, Cat --> eat()
	public abstract void eat(); //�߻�޼���==> �ҿ����� �޼���, ��ָ޼���

	public void move() { //�����޼��� : Cat, Dog�� ����� Ŭ������� ���� ������ ������ ���� ����.
		System.out.println("������ ��� �̵��Ѵ�.");
	}
	
	/*
	 * public Animal() { super(); }
	 */
}
