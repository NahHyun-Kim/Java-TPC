package kr.poly;
import java.lang.*;

public class A extends Object {

	public A() {
		super();
	}
	
	public void display() {
		System.out.println("나는 A이다.");
	}

	//object 클래스에 기본적으로 정의된 toString 메소드
	@Override
	public String toString() {
		return "재정의 메서드입니다.";
	}
	
	//toString 메서드 재정의
	
}
