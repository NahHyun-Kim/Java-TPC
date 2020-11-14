package Prac;

public class TPC13_prac {
	
	public static void main(String[] args) {

	String title = "스프링";
	int page = 200;
	String company = "대진";
	int price = 18000;
	
	BookDT dt = new BookDT(company, price, company, price);
	
	TPC13_prac.BookPrint(dt);
	
	}
	
	public static void BookPrint(BookDT dt) {
		System.out.print(dt.title + "\t");
		System.out.print(dt.page + "\t");
		System.out.print(dt.company + "\t");
		System.out.println(dt.price + "\t");
	}
}
