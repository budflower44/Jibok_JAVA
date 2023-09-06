package day04;

public class Continue01 {

	public static void main(String[] args) {
		/* Continue : Pass, Skip 키워드
		 * 1~10까지 출력 5만 빼고
		 * */
		
		for(int i = 1; i<=10; i++) {
			if(i==5) {
				continue;  // 조건에 맞다면 건너뛰기
			}
			System.out.print(i+" ");
		}
		
		/* 1~10까지 중 홀수만 출력
		 * 짝수일때 continue를 써서 출력
		 * */
		System.out.println();
		System.out.println("------------------");
		
		for(int i = 1; i<=10; i++) { // () 구문 뒤 ; 는 구문이 끝나버림
			if(i%2==0) {
				continue;
			}else if(i%2==1) {
				System.out.print(i+" ");
			}
		}
		
		// 선생님 답변
		System.out.println();
		for(int i =1; i<=10; i++) {
			if(i%2==0) {
				continue;
			}
			System.out.println(i+" ");
		}

		
	}

}