package kr.inflearn;

//(public 을 생략하면 default 개념으로 정의된다.)
//default : 패키지 내부에서는 사용이 가능하나, 외부에서는 가져다 쓸 수 없음.
public class MyClass {
	public int sum(int a, int b) {
		int hap=0;
		for(int i = a; i<=b; i++) {
			hap += i;
		}
		
		return hap; 
		//hap이 위의 sum으로 저장이 되어 int 형으로 return해줌
	}
	
}
