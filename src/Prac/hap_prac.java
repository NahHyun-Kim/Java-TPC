package Prac;

import java.util.Scanner;

public class hap_prac {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("첫 번째 값을 입력하세요. : ");
		int a = s.nextInt();
		
		System.out.println("두 번째 값을 입력하세요. : ");
		int b = s.nextInt();
		
		int v = add(a,b);
		
		System.out.println("합산한 결과는 : " + v + " 입니다.");

	}

	private static int add(int x, int y) {
		int sum = x + y;
		return sum;
		
	}

}
