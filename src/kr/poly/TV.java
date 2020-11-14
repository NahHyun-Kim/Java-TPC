package kr.poly;  //add unimplements method
public class TV implements RemoCon {

	int currCH = 70;
	
	@Override
	public void chUp() {
		if(currCH<RemoCon.MAXCH) { //최대 채널 100 이하이면
			currCH++;
		System.out.println("TV의 채널이 올라간다." + currCH);
		} else { //아니면
			currCH = 1; //채널을 1로 초기화한다.	
			System.out.println("TV의 채널이 올라간다.:"+currCH);
		}
	}

	@Override
	public void chDown() {
		 
			if(currCH > RemoCon.MINCH) {
				currCH--;
				System.out.println("TV의 채널이 내려간다." + currCH);
			} else {
				currCH=100;
				System.out.println("TV의 채널이 내려간다." + currCH);
			}
	
	}

	@Override
	public void internet() {
		System.out.println("인터넷이 된다.");
		
	}
	//그 외 TV클래스가 가진 독자적인 기능을 구현할 수 있다.
	
}
