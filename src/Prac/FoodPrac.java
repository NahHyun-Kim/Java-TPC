package Prac;

import kr.bit.FoodVO;

public class FoodPrac {

	public static void main(String[] args) {
		
		FoodVO fv = new FoodVO("°¨ÀÚÆ¢±è",350,"¸Æµµ³¯µå",2000);
		
		//toString()Àº »ý·«ÀÌ °¡´ÉÇÏ´Ù.
		System.out.println(fv.toString());
		
		FoodVO farr[] = new FoodVO[3];
		
		farr[0] = new FoodVO("°¨ÀÚÆ¢±è",350,"¸Æµµ³¯µå",2000);
		farr[1] = new FoodVO("¿Á¼ö¼ö¼ö¿°Â÷",0,"±¤µ¿",1300);
		farr[2] = new FoodVO("¾Æ¸Þ¸®Ä«³ë ºí·¢",33,"ÀÚµ­",11000);
		
		for(int i=0; i<farr.length; i++) {
			System.out.println(farr[i]);
		}
		
		FoodVO fv1 = new FoodVO();
		fv1.setFoodname("±è³ªÇö");
		fv1.setKcal(5000);
		fv1.setMakecompany("°¨ÀÚ");
		fv1.setPrice(150000000);
		
		System.out.println(fv1.toString());
		
		System.out.println("----------------------");
		
		System.out.print(fv1.getFoodname() + "\t");
		System.out.print(fv1.getKcal() + "\t");
		System.out.print(fv1.getMakecompany() + "\t");
		System.out.println(fv1.getPrice());

	}
}
