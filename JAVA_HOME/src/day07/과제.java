package day07;

import java.util.Scanner;

public class 과제 {
	//공통 변수들 선언 == 멤버변수
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		/* 계산기 만들기
		 * (+ - * / %) 각각 메서드 만들기 => 메서드에서 바로 출력
		 * ex) 3 5 => 메뉴
		 * - 원하는 계산을 선택해주세요>
		 * - 1: 덧셈, 2:뺄셈, 3:곱셈, 4: 나눗셈, 5:나머지, 그외:잘못된 연산
		 * 각 기능 메서드 => 바로 출력 (3 + 5 = 8)
		 * 
		 * 1. 숫자를 입력받는 메서드 => 숫자를 배열에 담아 리턴
		 * 2. 메뉴 메서드 => 메뉴를 출력하고, 메뉴의 번호를 입력받아 리턴
		 * 3. 각 기능 메서드들
		 * 
		 * main에서 할일
		 * 1) 1번 메서드 호출 => 숫자의 배열을 받기
		 * 2) 2번 메서드 호출 => 내 선택 번호 가져오기
		 * 3) switch(번호)
		 * 4) 기능 메서드 호출
		 * */
		
		//
		int[] num_ = number();
		int menu = menu();
		
		switch(menu){
		case 1: 
			System.out.printf("%d + %d = %d%n", num_[0], num_[1], plus(num_[0], num_[1]));
			break;
		case 2: 
			System.out.printf("%d - %d = %d%n", num_[0], num_[1], mius(num_[0], num_[1]));
			break;
		case 3: 
			System.out.printf("%d * %d = %d%n", num_[0], num_[1], mul(num_[0], num_[1]));
			break;
		case 4: 
			System.out.printf("%d / %d = %d%n", num_[0], num_[1], div(num_[0], num_[1]));
			break;
		case 5: 
			System.out.printf("%d % %d = %d%n", num_[0], num_[1], rem(num_[0], num_[1]));
			break;
		default:
			System.out.println("잘못된 입력입니다.");
		}
		
	}
	
	
	
	// 1. 숫자를 입력받는 메서드 => 숫자를 배열에 담아 리턴
	public static int[] number() {
		int[] number = new int[2];
		System.out.println("--두 정수 입력--");
		for(int i=0; i<2; i++) {
			number[i] = scan.nextInt();	
		}
		return number;
	}
	
	
	
	// 2. 메뉴 메서드 => 메뉴를 출력하고, 메뉴의 번호를 입력받아 리턴
	public static int menu() {
		int menu = 0;
			System.out.println("--menu--");
			System.out.println("1. 덧셈");
			System.out.println("2. 뺄셈");
			System.out.println("3. 곱셈");
			System.out.println("4. 나눗셈");
			System.out.println("5. 나머지");
			System.out.println("--연산할 메뉴 번호 입력--");
			
			menu = scan.nextInt();
		return menu;
	}
	
	
	// 3. + 기능 메서드
	public static int plus(int num, int num_) {
		return num+num_;
	}

	// 4. - 기능 메서드
	public static int mius(int num, int num_) {
		return num-num_;
	}
	
	// 5. * 기능 메서드
	public static int mul(int num, int num_) {
		return num*num_;
	}
	
	// 6. / 기능 메서드
	public static double div(int num, int num_) {
		return (double) num/num_;
	}
	
	// 7. % 기능 메서드
	public static int rem(int num, int num_) {
		return num%num_;
	}
	
	
	

}