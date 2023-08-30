package day02;

import java.util.Scanner;

public class 입력 {

	public static void main(String[] args) {
		/* 콘솔 입력 : 콘솔에서 값을 입력 받는 것을 의미
		 * Scanner 클래스 => 콘솔에서 값을 입력받을 수 있게 해주는 클래스
		 *  */
		Scanner scan = new Scanner(System.in); // 필요한 클래스는 불러와서 써야함 / 클래스명 객체명 = new 변수명 
		System.out.println("숫자(정수)를 입력해주세요.");
		int num = scan.nextInt();
		System.out.println("내가 입력한 수 : "+num);

		//콘솔에서 수자를 하나 입력받아 수가 짝수인지 홀수인지 출력
		System.out.println("숫자(정수)를 입력해주세요.");
		int num2 = scan.nextInt();
		num2 = 24;
		System.out.println((num2%2 == 0)? "짝수":"홀수");
		
		// 선생님 풀이
		if(num % 2 == 0) {
			System.out.println("짝수");
		}else {
			System.out.println("홀수");
		}
		//문제 : 숫자를 입력받아 양수인지, 음수인지, 0인지 판별하여 출력
//				Scanner scan = new Scanner(System.in);
				System.out.println("숫자를 입력해주세요.");
				int num_ = scan.nextInt();
				if(num_>0) {
					System.out.println("양수");
				}else if (num_==0) {
					System.out.println("0 입니다.");
				}else {
					System.out.println("음수");
				}
				
				// 선생님 풀이
				System.out.println("정수를 입력해주세요.");
				int num2_ = scan.nextInt();
				
				if (num2_ >0)
				
				System.out.println("-------------------");
				System.out.println("실수 입력 > ");
				double num3 = scan.nextDouble();
				System.out.println("실수 입력 > "+num3);
				
				System.out.println("한글자 입력 > ");
				// next() : 문자열 / charAt(index) : 문자열 중 index 번지 한글자 추출
				// 1글자만 띄어오고 싶다면, 1글자만 추출하는 형태로 
				char ch = scan.next().charAt(0); // 문자열 입력받는 형태
				System.out.println("한글자 > "+ch);
				
				//문자열 입력 : next() 공백 포함 안됨.
				System.out.println("문자열 > ");
				String s = scan.next();
				System.out.println("문자열 > "+s);
				
				scan.nextLine(); //enter 처리용
				
				// 여러 문자 입력 : nextLine () 공백 포함
				System.out.println("여러 문자 > ");
				String str = scan.nextLine();
				System.out.println("여러문자 > "+str);
					
				scan.close(); // input 선언에 대한 종료 선언 / 요 줄 안에서 작성해야 명령어가 먹힘
					
			}

		
	}
