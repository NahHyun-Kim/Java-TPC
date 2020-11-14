package Prac;

public class TPC06_prac {

	public static void main(String[] args) {
		
		int arr[] = arrSum();
		
		int hap = 0;
		for(int i=0; i<arr.length; i++) {
			hap += arr[i];
		}
		
		System.out.println(hap);
	}
	
		public static int[] arrSum() {
			
			int x = 10;
			int y = 20;
			int z = 30;
			int[] arr = new int[3];
			arr[0] = x;
			arr[1] = y;
			arr[2] = z;
			
			return arr;
		}
}
