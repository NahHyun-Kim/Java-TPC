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
		
		//상속 관계는 하위 클래스인 Dog. 자식인 Dog를 Animal 부모에 담을 수 있다. 
		//upcasting 관계, Dog 하위 클래스를 몰라도 부모를 통한 접근이 가능
		Animal ani = new Dog();
		ani.eat();
		
		ani = new Cat();
		ani.eat();
		
		//night는 하위
		//공통된 특성이 아닌 경우 cat으로 형변환, downcasting이 필요하다.
		((Cat)ani).night();
	}

}
