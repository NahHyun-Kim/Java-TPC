package Prac;

import java.util.Scanner;

public class Cal {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("a�� ���� �Է��ϼ��� : ");

	int a = sc.nextInt();	
	
	System.out.println("b�� ���� �Է��ϼ��� : ");
	int b = sc.nextInt();
	
	int v = add(a,b);
	
	System.out.println(a + "�� " + b + "�� ���� " + v + "�Դϴ�.");
	
	sc.close();
	}
	public static int add(int x, int y) {
		int hap = x + y;
		return hap;
	}
}
