package day12;

import java.util.Scanner;

//		while()
		

//ProductMain class 생성
//Product 상속 class
//메서드
// Product 배열[10] 생성
// 배열에 입력 값 넣기



//Product class 생성 (메뉴이름, 가격)
//생성자 : name, price
//메서드
// - 메뉴 추가
// - 메뉴: 가격 -> 출력

class Product{
	private String name;
	private String price;
	
	public Product() {}
	
	public Product(String name, String price) {
//		super();
		this.name = name;
		this.price = price;
	}
	Scanner scan = new Scanner(System.in);

	// 메서드 : 메뉴 추가 (메뉴+가격)
	public void menuAdd() {
		System.out.println("메뉴명을 입력해주세요. (메뉴명, 가격)");
		name = scan.next();
		price = scan.next();
	}

	// 메서드 : 출력
	public void printMenu() {
		System.out.println(name+" : "+price+"원");
	}
	
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}
	
	
}
