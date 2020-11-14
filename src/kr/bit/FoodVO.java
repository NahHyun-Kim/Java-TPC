package kr.bit;

public class FoodVO {

	private String foodname;
	private int kcal;
	private String makecompany;
	private int price;
	
	public FoodVO() {
		
	}

	public FoodVO(String foodname, int kcal, String makecompany, int price) {
		super();
		this.foodname = foodname;
		this.kcal = kcal;
		this.makecompany = makecompany;
		this.price = price;
	}

	public String getFoodname() {
		return foodname;
	}

	public void setFoodname(String foodname) {
		this.foodname = foodname;
	}

	public int getKcal() {
		return kcal;
	}

	public void setKcal(int kcal) {
		this.kcal = kcal;
	}

	public String getMakecompany() {
		return makecompany;
	}

	public void setMakecompany(String makecompany) {
		this.makecompany = makecompany;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "FoodVO [foodname=" + foodname + ", kcal=" + kcal + ", makecompany=" + makecompany + ", price=" + price
				+ "]";
	}
	
	
}
