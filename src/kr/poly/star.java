package kr.poly;

public class star extends Object implements RemoCon {
  
	 Object obj = new star(); 
	 int currLight = 1;
 
 @Override public void chUp() { 
	 for(int i=1; i<RemoCon.MAXLIGHT; i++) {
		 currLight++; 
		 if(currLight < RemoCon.MAXLIGHT) {
			 System.out.println("���� ��⸦ �÷��ݴϴ�." + currLight); } 
		 else {
			 currLight = 1; 
		 } 
	 }
 }
 
 @Override public void chDown() { 
	 for(int i=10; i>RemoCon.MINLIGHT; i--) {
		 currLight--; 
		 if(currLight > RemoCon.MINLIGHT) {
			 System.out.println("���� ��⸦ �����ݴϴ�."+ currLight);
		 } else { 
			 currLight = 10; 
			 } 
	 }
	 }
  
  @Override public void internet() { 
	  System.out.println("���� ������ ���ͳ����� �����ݴϴ�.");
  
  } }