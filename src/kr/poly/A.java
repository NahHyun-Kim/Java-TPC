package kr.poly;
import java.lang.*;

public class A extends Object {

	public A() {
		super();
	}
	
	public void display() {
		System.out.println("���� A�̴�.");
	}

	//object Ŭ������ �⺻������ ���ǵ� toString �޼ҵ�
	@Override
	public String toString() {
		return "������ �޼����Դϴ�.";
	}
	
	//toString �޼��� ������
	
}
