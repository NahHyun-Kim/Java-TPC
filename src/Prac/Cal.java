package Prac;

import java.util.Scanner;

public class Cal {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("a의 값을 입력하세요 : ");

	int a = sc.nextInt();	
	
	System.out.println("b의 값을 입력하세요 : ");
	int b = sc.nextInt();
	
	int v = add(a,b);
	
	System.out.println(a + "와 " + b + "의 합은 " + v + "입니다.");
	
	sc.close();
	}
	public static int add(int x, int y) {
		int hap = x + y;
		return hap;
	}
}
