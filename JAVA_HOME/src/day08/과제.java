package day08;

import java.util.Scanner;

public class 과제 {
	
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		/* 야구게임
		 * 컴퓨터가 3자리의 숫자를 랜덤 생성 (1~9까지만) => 중복 x
		 * user가 3자리 숫자를 맞추는 게임.
		 * 자리와 숫자가 일치하면 strike
		 * 숫자만 일치하면 ball, 없으면 out
		 * => 3 5 7
		 *    3 6 7 => 2s 
		 * 	  3 5 7
		 *    3 7 6 => 1s 1b
		 *    3 5 7
		 *    7 3 5 => 3b
		 *    3 5 7
		 *    1 2 6 => out
		 *    
		 *    --야구게임 시작
		 *    컴퓨터가 숫자를 정했습니다.
		 *    숫자 입력(1~9, 3자리) : 
		 *    3 4 5
		 *    결과
		 *    3s 다 맞으면 종료 (게임 횟수 출력)
		 * */
		
		System.out.println("--야구 게임 시작--");
		System.out.println("--컴퓨터가 숫자를 정했습니다.--");
		int computer[] = new int[3];
		printArray(computer);
		enter();
	}
	
	// 1. 컴퓨터가 중복되지 않는 1~9까지의 숫자를 생성하는 기능
	public static int random() {
		return (int)(Math.random()*9)+1;		
	}
	
	// 2. 중복 없이 숫자를 배열에 채우기
	
	public static void comNum(int com[]) {
		int i = 0;
		while(i<com.length) {
			int r = random();
			if(!isContain(com,r)) {
				com[i] = r;
				i++;
			}
		}
	}

	
	// 배열 출력
	public static void printArray(int com[]) {
		for(int i=0; i<com.length; i++) {
			System.out.print(com[i]+" ");
		}
	}
	
	// 같은지 체크
	public static boolean isContain(int com[], int num) {
		for(int tmp : com) {
			if(tmp == num) {
				return true;
			}
		}
		return false;
	}

	
	// 3. 반복 입력 기능
	public static void enter() {
		int enter[] = new int [3];
		System.out.println("--정답 입력--");
		for(int i=0; i<enter.length; i++) {
			enter[i] = scan.nextInt();			
		}
	}
	
	
	
	
	// 4. 맞추는 기능

	// 5. 결과 출력 기능
	
	

}