package kr.poly;  //add unimplements method
public class TV implements RemoCon {

	int currCH = 70;
	
	@Override
	public void chUp() {
		if(currCH<RemoCon.MAXCH) { //�ִ� ä�� 100 �����̸�
			currCH++;
		System.out.println("TV�� ä���� �ö󰣴�." + currCH);
		} else { //�ƴϸ�
			currCH = 1; //ä���� 1�� �ʱ�ȭ�Ѵ�.	
			System.out.println("TV�� ä���� �ö󰣴�.:"+currCH);
		}
	}

	@Override
	public void chDown() {
		 
			if(currCH > RemoCon.MINCH) {
				currCH--;
				System.out.println("TV�� ä���� ��������." + currCH);
			} else {
				currCH=100;
				System.out.println("TV�� ä���� ��������." + currCH);
			}
	
	}

	@Override
	public void internet() {
		System.out.println("���ͳ��� �ȴ�.");
		
	}
	//�� �� TVŬ������ ���� �������� ����� ������ �� �ִ�.
	
}
