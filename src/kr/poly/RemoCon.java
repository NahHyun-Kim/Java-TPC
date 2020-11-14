package kr.poly;

public interface RemoCon { //객체생성x; remocon r = new remocon(x) 
	
	//15도 기울어짐 : public static int final 생략
	//상수를 사용할 수 있다. 리모콘의 최소/최대 채널 설정
	//final : 변수가 아닌 상수이기 때문에 수정할 수 없다.
	public final static int MAXCH=100;
	int MINCH=1; //RemoCon.MINCH를 통해 접근 가능(static 사용했기 때문에)
	
	public final static int MAXLIGHT=10;
	int MINLIGHT=1; //별의 밝기를 설정하는 메서드(final-상수 수정 x)
	
	//추상메서드
	public abstract void chUp(); //abstract는 생략 가능
	public void chDown();
	public void internet();
	
	//자식 클래스가 implements(구현)을 해주어야만 사용이 가능하다. 부모-> 자식에게 메세지
	//추상 메서드 정의(body {}를 만들면 error. 구현 메소드를 가질 수 없다.)
}
