package kr.bit;

//책(Object.객체) --> 제목, 가격, 출판사, 페이지 수 ...
public class BookVO {

	public String title;
	public int price;
	public String company;
	public int page;
	
	//디폴드 생성자 메서드(생략)
	//생성자 메서드를 활용하여 객체를 적절하게 초기화 하는 중복 정의
	//Overloading
	//BookVO b = new BookVO();
	//BookVO b = new BookVO("자바",20000,"길벗",790); 
	//과 같은것이 overloading인데, 위의 BookVO와 BookVO를 다른 함수로 여김.
	/*public BookVO(//String title, int price, String company, int page) {
		this.title = title;
		this.price = price;
		this.company = company;
		this.page = page; }
//this.가 가리키는 멤버변수   //매개변수
		//초기화
*/	
	
	public BookVO() {
		//초기화 작업(초기화 하는 "동작")
		//this를 찍어야 자기자신에있는 멤버변수에 접근 할수있다.
		this.title = "자바";
		this.price = 14000;
		this.company = "이지스";
		this.page = 780;
	}
	
	//생성자 메서드를 중복해서 만들었을 경우,
	//default 생성자는 만들어지지 않는다. 만약 TPC12의 b1,b2를 디폴트 생성자를 지우고 실행하면 오류가 뜸.
	
	//####this. 설정은  source - field 설정으로 가능
	public BookVO(String title, int price, String company, int page) {
		//this를 통해 자기 자신을 가리키는 곳. 맨 위의 title,,,이런 곳에 넣어짐.
		//생성자 메서드의 중복정의(overloading)
		//매개변수 개수가 다르거나, 개수가 같으면 data type이 달라야 한다.
		this.title = title;
		this.price = price;
		this.company = company;
		this.page = page;
	}
}
