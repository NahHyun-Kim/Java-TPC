package Prac;

import java.util.Scanner;

public class hap_prac {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("ù ��° ���� �Է��ϼ���. : ");
		int a = s.nextInt();
		
		System.out.println("�� ��° ���� �Է��ϼ���. : ");
		int b = s.nextInt();
		
		int v = add(a,b);
		
		System.out.println("�ջ��� ����� : " + v + " �Դϴ�.");

	}

	private static int add(int x, int y) {
		int sum = x + y;
		return sum;
		
	}

}
