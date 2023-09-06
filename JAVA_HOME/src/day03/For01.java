package day03;

public class For01 {

	public static void main(String[] args) {
		/* 반복문 : 규칙적인 작업을 반복적으로 할 때 사용하는 문법
		 * for, while, do~whlie
		 * - for, while문은 동작하는 방식이 같음. 
		 *   => 조건에 맞지 않으면 한번도 실행 안될 수 도 있음.
		 * - do~while문은 두 방식과 동작하1는 방식이 조금 다름.
		 *   => 조건에 맞지 않아도 무조건 1번은 실행됨.
		 * 
		 * for(1초기화 ; 258조건식 ; 47증감식) {
		 *  36실행문 ; 
		 *  }
		 *  
		 *  - 초기화 : 조건식이나 실행문에서 사용할 변수를 초기화시키는 작업 : 생략가능
		 *  			처음 1번만 실행
		 *  - 조건식 : 반복문의 반복을 결정하는 식 (true => 반복 / false => 빠져나감) : 생략가능
		 *  - 증감식 : 조건식에서 사용되는 변수를 증가 / 감소시켜 반복횟수를 조절
		 * */
		
		//1~10까지 출력하는 예제
		//초기화 : i(index 약자)변수 사용 => int i = 1; / 배열 등등
		//조건식 : 10이 될때까지 => i <= 10;
		//증감식 : i가 1씩 증가 => i++; (i = i + 1) 동일함
		//실행문 : i출력
		for(int i = 1; i <= 10; i++) {
			System.out.print(i+" ");
		}
		System.out.println(); // 줄바꿈용
		System.out.println("-------------------");
		
		//10부터 1까지 출력하는 예제 (풀어보기)
		for(int e = 10; e >= 1; e--) {
			System.out.print(e+" ");
		}
		// 선생님 풀이
		for(int i=10; i>=1; i--) { // 10 >= 1 / i에 시작값 대입하면 조건식 쓰기 쉬움
			System.out.print(i+" ");
		}
		System.out.println(); // 줄바꿈용
		System.out.println("-------------------");		
		
		//2부터 10까지 짝수만 출력 예제
		for(int i=2; i<=10; i=i+2) {
			System.out.print(i+" ");
		}
		// 선생님 풀이
		for(int i=2; i<=10; i=i+2) {
			System.out.print(i+" ");
		}
		
		System.out.println(); // 줄바꿈용
		System.out.println("-------------------");		
		
		//1부터 20까지 중 짝수만 출력 예제
		//if문을 사용하여 조건에 맞는 자료만 출력
		for(int i = 1; i<=20; i++) {
			if(i % 2 == 0) { // 홀수만 출력 : i%2 == 1
				System.out.print(i+" ");
			}
		}
		
		System.out.println(); // 줄바꿈용
		System.out.println("-------------------");	
		
		//1부터 10까지 홀수만 출력 / 짝수일때는 짝수pass~!! (직접풀이)
		for(int i = 1; i<=10; i++) {
			if(i % 2 == 1) {
				System.out.print(i+" ");
			}else {
				System.out.print(" 짝수pass~!! ");
			}
		}
		// 선생님 답변
		for(int i = 1; i<=10; i++) {
			if(i%2 ==1) {
				System.out.print(i+" ");
			}else {
				System.out.print("pass~!! ");
			}
		}
		System.out.println(); // 줄바꿈용
		System.out.println("-------------------");	
		
		//1부터 10까지 합계 출력 (풀어보기)
		//실행문 : 누적 더하기
		//실행 후 출력
		int sum = 0; //지역변수 초기화
		for(int i = 1; i<=10; i++) {
			sum = sum + i; // 0+1+2+3+4 / Q&A:반복문일때, sum 값에 sum+i값을 다시 저장할 수 있음.
			// 요 안에다가 출력하면 누적이 아니라 반복합계가 출력됨.
		}
		System.out.println(sum); // 합계 하나만 출력하고 싶으면 반복문 밖에다가 출력하기
		
		// 선생님 풀이
		//1부터 10까지 합계 출력 (풀어보기)
		//초기화 : 1부터, 조건식 : 10까지, 증감식 : 1씩증가
		//실행문 : 누적 더하기
		//실행 후 출력
		// 지역변수() {생성  소멸}
		int sum1 = 0; // 초기화를 안할 경우 값이 없어서 밑에서 활용하지 못함 / sum+i가 불가능함 => sum이 초기화가 안되어서 값이 없었기 때문
		for(int i=1; i<=10; i++) {
			sum1 = sum1 + i; //0+1+2+3+4+5+...+10
		}
		System.out.println(sum1);
		
		System.out.println(); // 줄바꿈용
		System.out.println("-------------------");	
		
		//1부터 10까지 짝수의 합과 홀수의 합을 출력
		int sum2 = 0;
		int sum3 = 0;
		for(int e = 1; e<=10; e++) {
			if(e%2==0) {
				sum2 = sum2 + e;
			}
		}
		System.out.println(sum2);
		
		for(int g = 1; g<=10; g++) {
			if(g%2==1) {
				sum3 = sum3 +g; // Q&A: sum3 = sum3 +g 동일한 축약 표기 => sum3 += g 
			}
		}
		System.out.println(sum3);
		
		//선생님 풀이
		/* for  1부터, 10까지 1씩증가하여 값을 비교
		 * if 짝수인지 판단 => 짝수의 합계 구함
		 *    홀수인지 판단 => 홀수의 합계 구함
		 * for문 종료 후 => 출력
		 * */
		int sum1_ = 0;
		int sum2_ = 0;
		
		for(int i=1; i<=10; i++) {
			if(i%2==0) {
				//짝수 합계를 누적
				sum1_=sum1_+i;
			}else {
				sum2_=sum2_+i;
			}
		}
		System.out.println("짝수합: "+sum1_);
		System.out.println("홀수합: "+sum2_);
		
		
	}

}