package kr.bit;

public class MovieVO {
	
	//모든 멤버의 정보 은닉화
	 private String title;
	 private int price;
	 private String author;
	 private int level;
	 private float time;
	 
	 //생성자 오버로딩(source-field)
	 public MovieVO(String title, int price, String author, int level, float time) {
		super();
		this.title = title;
		this.price = price;
		this.author = author;
		this.level = level;
		this.time = time;
	}


	//디폴트 생성자 메서드 명시적으로 생성
	 public MovieVO() {
		 
	 }


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public String getAuthor() {
		return author;
	}


	public void setAuthor(String author) {
		this.author = author;
	}


	public int getLevel() {
		return level;
	}


	public void setLevel(int level) {
		this.level = level;
	}


	public float getTime() {
		return time;
	}


	public void setTime(float time) {
		this.time = time;
	}


	@Override
	public String toString() {
		return "MovieVO [title=" + title + ", price=" + price + ", author=" + author + ", level=" + level + ", time="
				+ time + "]";
	}
	 
	 
}
