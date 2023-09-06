package day09;

import java.util.Scanner;

public class 과제_선생님풀이 {

	public static void main(String[] args) {
		// 클래스 객체 생성 (2명)
		// 값을 입력 후 정보 출력
		Student s1 = new Student();
		
		
		Student s2 = new Student();
		Scanner scan = new Scanner(System.in);
		System.out.println("이름");
		s2.setName(scan.next());
		System.out.println("나이");
		s2.setAge(scan.nextInt());
		System.out.println("tel");
		s2.setPhone(scan.next());
		System.out.println("주소");
		s2.setAddr(scan.next());
		s2.stdPrint();
		
		
		Student s3 = new Student();
		s3.input("철수", 25, "010-5555-6666", "인천시");
		s3.stdPrint();
		
		Student s4 = new Student("홍길순", 23, "010-7777-8888", "----");
		s4.stdPrint();
		
		Student s5 = new Student("홍아이", 5);
		s5.stdPrint();
		
		
		scan.close();
		
	}

}

//클래스 생성
//학생 클래스 생성
//이름, 나이, 전화번호, 주소
//출력
//이름(나이) 전화번호
// 클래스는 언젠가 쓸일이 생길 걸 대비하여 만드는 경우가 많음
class Student{
	//멤버변수
	private String name;
	private int age;
	private String phone;
	private String addr;
	
	//생성자 위치
	//생성자를 사용자가 만들어버리면 new 생성자를 인식하지 않음
	//생성자 오버로딩 가능.
	// - 매개변수 개수가 다르거나, 매개변수 유형이 다르거나..
	public Student() {} // 컴파일러가 자동으로 제공하는 생성자 => 없으면 메인에서 제공하지 않는 생성자만 지원안할뿐
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public Student(String name, int age, String phone, String addr) {
		//생성자 호출 - 반드시 첫줄에서만 가능. 
		this(name, age);
		this.phone = phone;
		this.addr = addr;
	}
	
	
	
	public void stdPrint() {
		System.out.println(name+"("+age+") "+phone);
	}
	
	public void input(String name, int age, String tel, String addr) {
		this.name = name;
		this.age = age;
		this.phone = tel;
		this.addr = addr;
	}
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getPhone() {
		return phone;
	}
	public String getAddr() {
		return addr;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	
}




