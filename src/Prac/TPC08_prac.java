package Prac;

public class TPC08_prac {

	public static void main(String[] args) {
		int a = 30;
		int b = 50;
		
		int v = sum(a,b);
		System.out.println(v);
	}

	public static int sum(int a, int b) {
		int v = a + b;
		return v;
	}
}
