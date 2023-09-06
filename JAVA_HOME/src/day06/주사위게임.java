// 유저 주사위 굴리는 버전

package day06;

import java.util.Scanner;

public class 주사위게임 {

	public static void main(String[] args) {
		/* 주사위를 던져서 총 30칸을 이동하면 완주
		 * 주사위 : 1~6 랜덤수
		 * ex) 
		 * 	주사위 : 3
		 * 	3칸 이동 => 27칸 남았습니다.
		 * 	주사위 : 6
		 * 	6칸 이동 => ??칸 남았습니다.
		 * 	...
		 * 	도착~!! 총 이동 횟수 : 8번만에 완주
		 * */
		
		//1. 주사위를 굴려주세요 (1값 입력)
		//2. 주사위 : 랜덤 생성
		//3. 텍스트 출력 : N칸 이동 => 30-N칸 남았습니다.
		//4. 30칸 까지 반복 / 주사위 개수 누적 함수
		//5. 30칸 조건 만족 시 -> "도착 ~!! 총 이동 횟수"+n+"번 만에 완주" 텍스트 출력
		
		Scanner scan = new Scanner(System.in);
		
		int dice = 0;
		int c = 0;
		int sum = 0;
		int n = 0;
		
		
		for(int i=1; ; i++) {
			System.out.println("주사위를 굴려주세요 (1 입력)");
			c = scan.nextInt();
			if(c==1) {
				dice = (int)(Math.random()*6)+1;
				System.out.println(dice+"칸 이동 => "+(30-sum)+"칸 남았습니다.");
				sum += dice;
				n += 1;
				if(sum>=30) {
					System.out.println("도착~!! 총 이동 횟수 : "+n+"번 만에 완주했습니다~!");
					break;
				}
			}
		}
		
		
		scan.close();
	}

}