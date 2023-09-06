package day02;

import java.util.Scanner;

public class IF02 {

	public static void main(String[] args) {
		/* 국어, 영어, 수학 점수를 입력받아서
		 * 합계, 평균, 평가를 출력
		 * 평가는 평균이 90 이상이면 A
		 * 평균이 80 이상이면 B
		 * 평균이 70 이상이면 C
		 * 나머지는 D
		 * 
		 * 입력값이 0보다 작거나 100보다 크면 잘못된 값
		 *  */
		Scanner scan = new Scanner(System.in);
//		System.out.println("값을 입력해주세요.");
//		int kr = scan.nextInt();
//		int en = scan.nextInt();
//		int ma = scan.nextInt();
//		
//		int sum = kr+en+ma;
//		int avg = (kr+en+ma)/3;
//
//		if (kr<0) {
//			System.out.println("국어 : 잘못된 값입니다.");
//		}else if (kr>100) {
//			System.out.println("국어 : 잘못된 값입니다.");
//		}
//		if (en<0) {
//			System.out.println("영어 : 잘못된 값입니다.");
//		}else if (en>100) {
//			System.out.println("영어 : 잘못된 값입니다.");
//		}
//		if (ma<0) {
//			System.out.println("수학 : 잘못된 값입니다.");
//		}else if (ma>100) {
//			System.out.println("수학 : 잘못된 값입니다.");
//		}
//		
//		System.out.println("합계 : "+sum+", 평균 : "+avg);
//		if (avg>=90) {
//			System.out.println("평가 : A");
//		}else if (avg>=80) {
//			System.out.println("평가 : B");
//		}else if (avg>=70) {
//			System.out.println("평가 : C");
//		}else {
//			System.out.println("평가 : D");
//		}
		
		// 선생님 풀이
		// 입력 안내 문자
		System.out.println("정수 입력(0~100) : 국어, 영어, 수학 순으로 입력.");
		
		int kor = scan.nextInt();
		int eng = scan.nextInt();
		int math = scan.nextInt();
		
		if(kor <0 || kor > 100) {
			System.out.println("국어점수가 입력 범위를 벗어났습니다.");
		}
		if(eng <0 || eng > 100) {
			System.out.println("영어점수가 입력 범위를 벗어났습니다.");
		}
		if(math <0 || math >100) {
			System.out.println("수학점수가 입력 범위를 벗어났습니다.");
		}
		
		int sum = kor + eng + math;
		
		double avg = sum / 3.0;
		
		System.out.println("합계:"+sum+", 평균:"+avg);
		
		char ch = 'D'; //char 형태는 ''
		if(avg>100 || avg <0) {
			System.out.println("잘못된 성적");
		}else if(avg >=90) {
			ch='A';
		}else if(avg >=80) {
			ch='B';
		}else if(avg >=70) {
			ch='C';
		}else {
			ch='D';	
		}
		System.out.println("평가: "+ch);
		
		
		
		
		
		scan.close();
		
	}

}