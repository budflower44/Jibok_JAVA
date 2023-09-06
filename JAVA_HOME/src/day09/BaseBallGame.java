package day09;

import java.util.Scanner;

public class BaseBallGame {

	public static void main(String[] args) {
		/* day08 과제 => 메서드로 변경
		 * 랜덤번호 생성
		 * 배열에 추가(중복제거 메서드)
		 * 출력 메서드
		 * 스트라이크 메서드 => 개수 리턴
		 * 볼 메서드 => 개수 리턴
		 * */
		int comNum[] = new int[3];
		int myNum[] = new int[3];
		
		// 결과 반복
		
		//1. 랜덤번호 생성 출력
//		randomArray(comNum, 9,1);
//		for(int i=0;i<comNum.length; i++) {
//			System.out.print(comNum[i]+" ");			
//		}
//		printArray(comNum);
		int count = 9;
		int start = 1;
		int s = 0;
		int b = 0;
		int cnt = 0;
		
		Scanner scan = new Scanner(System.in);
		
		randomArray(comNum, count, start);
		System.out.println("야구게임 시작");
		while(s!=3) {
			System.out.println("1~9까지 3가지 정수 입력");
			for(int i=0; i<myNum.length; i++) {
				myNum[i] = scan.nextInt();
			}
			cnt++;  // 반복문 밖에서 카운트
			s = strike(comNum, myNum);
			b = ball(comNum, myNum);
			
			if(s!=0) {
				System.out.println(s+"s");
			}
			if (b!=0)
				System.out.print(b+"b");
			System.out.println();
			System.out.println("게임 횟수"+cnt);
			if(s==0 && b==0) {
				System.out.println("OUT~!!");
			}
			if(s==3) {
				System.out.println("정답입니다~!!");
				break;
			}			
		}
		
		
	}
	
	/* 랜덤번호 생성 : 매개변수로 범위를 설정
	 * (int)(Math.random()*9(개수))+1(시작값);
	 * 매개변수 => 개수, 시작값
	 * if처리 => 개수와 시작값이 바뀌어서 들어올 때 처리
	 * */
	
	//1. 랜덤번호 생성
	public static int random(int count, int start) {
//		int ran [] = new int [count];
//		for(int i=0; i<ran.length; i++) {			
//			ran[i] = (int)(Math.random()*num)+start;	
//			}
//		return ran;
		return (int)(Math.random()*count)+start;
	}
	

	//2. 배열에 추가(중복제거 메서드)

	public static void randomArray(int ran[], int count, int start) {
		int i = 0;
		while(i < ran.length) {
			int r = random(count, start);
			if(!isContain(ran,r)) {
				ran[i]=r;
				i++;
			}
		}
		
	}
	
	// 중복 제거
	
	public static boolean isContain(int arr[], int random) {
		for(int tmp : arr) {
			if(tmp == random) {
				return true;
			}
		}
		return false;
	}
	
	
	//3. 배열 출력 메서드
	
	public static void printArray(int arr[]) {
		for(int tmp : arr) {
			System.out.print(tmp+" ");
		}
		System.out.println();
	}
	
	//4. 스트라이크 메서드
	
	public static int strike(int com[], int my[]) {
		int cnt = 0;
		for(int i=0; i<com.length; i++) {
			if(my[i]==com[i]) {
					cnt++;
			}
		}
		return cnt;
	}
	
	//5. 볼 메서드
	public static int ball(int com[], int my[]) {
		int cnt = 0;
		for(int i=0; i<com.length; i++) {
			if(isContain(my,com[i])) {
				cnt++;
			}
		}
		return cnt - strike(com, my);
	}
	
	

}