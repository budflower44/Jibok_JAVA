package day04;

public class While01 {

	public static void main(String[] args) {
		/* While : 반복문 중 하나.
		 * While(조건식) { // true일때 반복
		 * 실행문;
		 * 증감식; // 조건식을 false로 만들 수 있는 
		 * }
		 * */
		
		/* 1~10까지 출력
		 * */
		
		for(int i = 1; i<=10; i++) {
			System.out.print(i+" ");
		}
		
		System.out.println();
		System.out.println("-------------------");
		int i = 0; // 반복하기 위한 초기화
		while(i<=10) {
			System.out.print(i+" ");
			i++;
		}
		
		/* 1~10까지 짝수만 출력
		 * */
		System.out.println();
		System.out.println("---------------");
		
		i = 0;
		while(i<=10) {
			i++; // 증감 먼저 써도 상관 없음
			if(i%2 == 0) {
				System.out.print(i+" ");
			}
			
		}
		
		
		
	}

}