package kr.poly;

//�����Ǹ� ���� ������ Dog �� �߻�Ŭ������ �Ǿ������.
//����, �θ��� animal�� �߻�Ŭ�������� �����ǰ� �ʿ��ϴ�.
public class Dog extends Animal {

	//1) eat unimplemented method/ 
	//2) source - override
	//3) ���� public void eat() ����
	public void eat() {
		System.out.println("�� ó�� �Դ�.");
	}
	public Dog() {
		super(); //new Animal();�� ȣ���� �Ͱ� �����
		//super()�� animal�� ���� �θ� ��ü���� ������.
	}
}
