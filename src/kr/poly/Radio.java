package kr.poly;

public class Radio implements RemoCon {

	@Override
	public void chUp() {
		System.out.println("Radio 채널이 올라간다.");
	}

	@Override
	public void chDown() {
		System.out.println("Radio 채널이 내려간다.");
	}

	@Override
	public void internet() {
		System.out.println("Radio는 인터넷이 지원되지 않는다.");
	}

	//radio에 마우스를 올려서 add unimplements method
	//또는 soruce탭 -> override 를 통해 구현되지 않은 부모의 메서드 추가
	
	
}
