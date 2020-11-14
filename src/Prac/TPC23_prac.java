package Prac;

import kr.poly.Animal;
import kr.poly.Cat;
import kr.poly.Dog;

public class TPC23_prac {

	public static void main(String[] args) {
	
		Dog d = new Dog();
		display(d);
		Cat c = new Cat();
		display(c);
		
		
	}

	private static void display(Animal r) {
		r.eat();
		
		//r이 Cat 타입으로 instance화 되었다면,(true)라면 
		if(r instanceof Cat) {
			((Cat)r).night();
		}
	}

}
