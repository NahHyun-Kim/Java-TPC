package Prac;

import kr.poly.Animal;
import kr.poly.Cat;
import kr.poly.Dog;

public class TPC24_prac {

	public static void main(String[] args) {
		Animal[] ani = new Animal[2];
		
		ani[0] = new Dog();
		ani[1] = new Cat();
		
		for(int i=0; i<ani.length; i++) {
			ani[i].eat();
			if(ani[i] instanceof Cat) {
				((Cat)ani[i]).night();
			}
		}
		display(ani);
	}

	private static void display(Animal[] ani) {
		for(int i=0; i<ani.length; i++) {
			ani[i].eat();
			
			if(ani[i] instanceof Cat) {
				((Cat)ani[i]).night();
			}
		}
	}

}
