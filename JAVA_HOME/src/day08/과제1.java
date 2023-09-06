package day08;

import java.util.Scanner;

public class 과제1 {

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
		과제 m = new 과제();
		
		int comNum[] = new int[3];
		comNum = random();
		gameStart(comNum);
		
		
		

	}
	public static int[] random() {
		int comRandom[] = new int[3];
		while(true) {
			int count = 0;
			for(int i=0; i<comRandom.length; i++) {
				comRandom[i] = (int)(Math.random()*9)+1;
			}
			for(int j=0; j<comRandom.length; j++) {
				for(int k=j+1; k<comRandom.length; k++) {
					if(comRandom[j]==comRandom[k]) {
						count++;
					}
				}
			}
			if(count ==0) {
				System.out.println("--야구게임 시작--");
				System.out.println("컴퓨터가 숫자를 정했습니다.");
				break;
			}
		}
		return comRandom;
	}
	
	public static void gameStart(int[] comRandom) {
		String userInStr[] = new String[3];
		int userNum[] = new int [3];
		int checkCount = 0;
		while(true) {
			int strike = 0;
			int ball = 0;
			System.out.println("숫자 입력(1~9)");
			String inStr = scan.next();
			userInStr = inStr.split(" ");
			for(int i=0; i<userInStr.length; i++) {
				userNum[i] = Integer.parseInt(userInStr[i]);
			}
			checkCount++;
			
			for(int j=0; j<userInStr.length; j++) {
				for(int k=0; k<userInStr.length; k++) {
					if(comRandom[j]==userNum[k]) {
						if(j==k) {
							strike++;
						}else {
							ball++;
						}
					}
				}
			}
			if(strike==3) {
				System.out.println("3s 게임 횟수: "+checkCount);
				break;
			}
			
			if(strike==0 && ball ==0) {
				System.out.println("OUT~!!");
			}else {
				System.out.println(strike+"s"+ball+"b");
			}
			
		}
	}

}