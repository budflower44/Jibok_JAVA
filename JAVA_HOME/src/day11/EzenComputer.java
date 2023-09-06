package day11;
/* 수강관리 프로그램 
 * EzenComputer 클래스 생성
 * - 학생의 기본정보 :  이름, 생년월일, 나이, 전화번호
 * - 학원 정보 : 학원이름 = “EZEN”, 지점
 * - 수강정보 : 수강과목, 기간(2023-08-16~2024-03-14)
 * 
 * ex) 홍길동, 990101, 24, 010-1111-1111   ⇒ 학생정보 출력
 *     EZEN, 인천지점                       ⇒ 학원정보 출력
 *     자바 (6개월), DB(1개월), html(2개월)   ⇒ 수강정보 출력
 *
 * 기능
 * - 학생정보출력, 학원정보출력, 수강정보출력
 * - 학생의 수강정보를 추가하는 기능.
 * */

import java.util.Scanner;

public class EzenComputer {
	
	Scanner scan = new Scanner(System.in);

	//final => 변경 불가능한
	//멤버변수 선언
	private String name;
	private String birth;
	private int age;
	private String phone;
	public final static String company = "EZEN";
	public String branch;
	//수강정보 => 한 사람이 여러 과목을 수강
	private String[] courser = new String[5]; // 수강과목 5개
	private String[] period = new String[5]; // 수강기간 5개
	
	private int cnt; // 배열의 index 처리를 위한 변수
		
	//생성자
	/* ex) 홍길동, 990101, 24, 010-1111-1111   ⇒ 학생정보 출력
	 *     EZEN, 인천지점                       ⇒ 학원정보 출력
	 *     자바 (6개월), DB(1개월), html(2개월)   ⇒ 수강정보 출력
	 */
	public EzenComputer() {}
	public EzenComputer(String name, String phone) {
		this.name = name;
		this.phone = phone;
	}
	public EzenComputer(String name, String phone, String birth, int age) {
		this(name, phone);
		this.birth = birth;
		this.age = age;
	}
	
	public EzenComputer(String[] courser, String[] period) {
		this.courser = courser;
		this.period = period;
	}
	
	//메서드 (출력, 수강정보를 추가)
	/* - 학생정보출력, 학원정보출력, 수강정보출력
	 * - 학생의 수강정보를 추가하는 기능.
	 */
	public void printStudentInfo1() {
		System.out.print(name+", ");
		System.out.print(phone);
	}
	
	public void printStudentInfo2() {
		System.out.print(name+", ");
		System.out.print(birth+", ");
		System.out.print(age+", ");
		System.out.print(phone);
	}
	
	public void printCompayInfo() {
		System.out.print(company+", ");
		System.out.print(branch);
	}
	
	public void inputCourser() {
		for(int i=0; i<courser.length; i++) {
			courser[i] = scan.next();
			cnt++;
		}
	}
	
	public void inputPeriod() {
		for(int i=0; i<period.length; i++) {
			period[i] = scan.next();
		}
	}
	
	//혼자 문제 : 값을 추가하는 기능을 만들어보자.
	// - 임의의 배열을 만드는 메소드를 만들어서, 그 배열을 length 두배 정도로 늘려서, 
	// ArrayCopy로 값을 복사+확장한 다음에 기존 배열에 넣는 것으로 치환하면 됨  
//	public void addCourser() {
//		System.out.println("추가할 과목을 입력해주세요.");
//		System.arraycopy(courser, 0, courser1, 0, courser1.length);
//		for(int i=0; ; i++) {
//			courser1[i] = scan.next();
//		}
//		System.arraycopy(peroid, 0, courser1, 0, courser1.length);
//		for(int i=0; ; i++) {
//			courser1[i] = scan.next();
//		}
//	} 
	
	
	public void printSubjectInfo() {
		System.out.print(name+" 학생의 수강 과목 : ");
		for(int i=0; i<courser.length; i++) {
			System.out.print(courser[i]);
			System.out.print("("+period[i]+"), ");
		}
		System.out.print("/ 수강 과목 개수: "+cnt);
	}
	
	
	//getter/setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getBranch() {
		return phone;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String[] getCourser() {
		return courser;
	}
	public void setCourser(String[] courser) {
		this.courser = courser;
	}
	public String[] getPeriod() {
		return period;
	}
	public void setPeriod(String[] period) {
		this.period = period;
	}
	public int getCnt() {
		return cnt;
	}
	public void setCnt(int cnt) {
		this.cnt = cnt;
	}
	public static String getCompany() {
		return company;
	}
//	public String[] getCourser1() {
//		return courser1;
//	}
//	public void setCourser1(String[] courser1) {
//		this.courser1 = courser1;
//	}
//	public String[] getPeriod1() {
//		return period1;
//	}
//	public void setPeriod1(String[] period1) {
//		this.period1 = period1;
//	}
	
}
