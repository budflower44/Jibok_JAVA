package day12;

public class Product_선생님풀이 {
	
	private String name;
	private int price;
	
	public Product_선생님풀이 () {}
	public Product_선생님풀이(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	//삽입메서드
	public void insertProduct_선생님풀이(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "[메뉴 : " + name + ", 가격 : " + price + "]";
	}
	
	
	
	

}
