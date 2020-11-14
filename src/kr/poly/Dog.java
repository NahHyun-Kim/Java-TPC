package kr.poly;

//재정의를 하지 않으면 Dog 도 추상클래스가 되어버린다.
//따라서, 부모인 animal이 추상클래스지만 재정의가 필요하다.
public class Dog extends Animal {

	//1) eat unimplemented method/ 
	//2) source - override
	//3) 직접 public void eat() 선언
	public void eat() {
		System.out.println("개 처럼 먹다.");
	}
	public Dog() {
		super(); //new Animal();을 호출한 것과 비슷함
		//super()인 animal로 가서 부모 객체부터 생성함.
	}
}
