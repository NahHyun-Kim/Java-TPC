package Prac;

import kr.poly.Animal;
import kr.poly.Cat;
import kr.poly.Dog;

public class TPC20_prac {

	public static void main(String[] args) {
		Dog d = new Dog();
		d.eat();
		
		Cat c = new Cat();
		c.eat();
		
		//��� ����� ���� Ŭ������ Dog. �ڽ��� Dog�� Animal �θ� ���� �� �ִ�. 
		//upcasting ����, Dog ���� Ŭ������ ���� �θ� ���� ������ ����
		Animal ani = new Dog();
		ani.eat();
		
		ani = new Cat();
		ani.eat();
		
		//night�� ����
		//����� Ư���� �ƴ� ��� cat���� ����ȯ, downcasting�� �ʿ��ϴ�.
		((Cat)ani).night();
	}

}
