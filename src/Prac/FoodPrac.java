package Prac;

import kr.bit.FoodVO;

public class FoodPrac {

	public static void main(String[] args) {
		
		FoodVO fv = new FoodVO("����Ƣ��",350,"�Ƶ�����",2000);
		
		//toString()�� ������ �����ϴ�.
		System.out.println(fv.toString());
		
		FoodVO farr[] = new FoodVO[3];
		
		farr[0] = new FoodVO("����Ƣ��",350,"�Ƶ�����",2000);
		farr[1] = new FoodVO("������������",0,"����",1300);
		farr[2] = new FoodVO("�Ƹ޸�ī�� ��",33,"�ڵ�",11000);
		
		for(int i=0; i<farr.length; i++) {
			System.out.println(farr[i]);
		}
		
		FoodVO fv1 = new FoodVO();
		fv1.setFoodname("�質��");
		fv1.setKcal(5000);
		fv1.setMakecompany("����");
		fv1.setPrice(150000000);
		
		System.out.println(fv1.toString());
		
		System.out.println("----------------------");
		
		System.out.print(fv1.getFoodname() + "\t");
		System.out.print(fv1.getKcal() + "\t");
		System.out.print(fv1.getMakecompany() + "\t");
		System.out.println(fv1.getPrice());

	}
}
