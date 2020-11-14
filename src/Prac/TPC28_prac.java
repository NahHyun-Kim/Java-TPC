package Prac;

import kr.poly.A;

public class TPC28_prac {

	public static void main(String[] args) {

		A a = new A(); //객체 생성, 인스턴스화
		a.display();
		
		System.out.println(a);
		
		Object o = new A(); //upcasting 
		
		((A)o).display(); //downcasting 해준다.
		
		if(a instanceof A) {
			((A)o).display();
		}
	}

}
