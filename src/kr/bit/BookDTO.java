package kr.bit;

public class BookDTO {

	public String title;
	public int page;
	public String company;
	public int price;

	//��ǻ� ������ �����ڸ޼���
public BookDTO() {
	
}

	public BookDTO(String title, int page, String company, int price) {
		super();
		this.title = title;
		this.page = page;
		this.company = company;
		this.price = price;
	}


}


