package Prac;

import kr.poly.A;

public class TPC28_prac {

	public static void main(String[] args) {

		A a = new A(); //��ü ����, �ν��Ͻ�ȭ
		a.display();
		
		System.out.println(a);
		
		Object o = new A(); //upcasting 
		
		((A)o).display(); //downcasting ���ش�.
		
		if(a instanceof A) {
			((A)o).display();
		}
	}

}
