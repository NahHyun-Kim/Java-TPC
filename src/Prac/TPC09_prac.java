package Prac;

public class TPC09_prac {

	public static void main(String[] args) {
		// static �� ������� �ʰ� new �����ڸ� ����� ����
		int a = 48;
		int b = 56;
		
		TPC09_prac tpc = new TPC09_prac();
		int v = tpc.add(a,b);

		System.out.println(v);
	}

	public int add(int a, int b) {
		int v = a + b;
		return v;
	}
}
