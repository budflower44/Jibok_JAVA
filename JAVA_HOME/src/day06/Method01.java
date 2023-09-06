package day06;

public class Method01 {
	
	//메서드 선언 위치
	
	public static void main(String[] args) {
		/* 메서드 : 기능 / 함수
		 * 접근제어자(제한자) : 접근할 수 있는 주체의 제한범위
		 * 리턴타입 : 메서드의 실행 결과로 받을 수 있는 정보의 값 (자료형)
		 * 메서드명 : 메서드의 이름 => 소문자로 시작
		 * 매개변수 : 매서드를 실행하기 위해서 필요로 하는 값 (자료형 변수명)
		 * 메서드 선언 구형
		 * 접근제어자 리턴타입 메서드명 (매개변수, 매개변수) {
		 *  구현;
		 * }
		 * 메서드 선언 위치
		 * 클래스 안, 다른 메서드 밖
		 * 	 public static void main(Strin[] args) {} 밖의 위치 
		 * */
		
			int sum = sum(3,5);
			System.out.println(sum);
		
			int sum1 = sum(sum, 10);
			System.out.println(sum1);
			
			int sum2 = multiply(3,5);
			System.out.println(sum2);
			
			//선생님 풀이
			int mul = mul(3,5);
			System.out.println(mul);
			System.out.println(mul(5,8));
			
			sum2(10,20);
			// 용도의 차이 : 찍고 마느냐, 다른 값에 이용하는 경우냐
			
			
	}
	
	//메서드 선언 위치
	/* 기능 : 두정수가 주어지면 두 정수의 합을 알려주는 메서드
	 * 리턴타입 : 알려줘야 하는 값 => 합 (int)
	 * 매개변수 : 두 정수 => int num1, int num2
	 * 메서드명 : sum (맘대로 대신, 의미를 함축할 수 있는 것)
	 * 
	 * */
	
	public static int sum(int num1, int num2) {
		int result = num1 + num2;
		return result;
		
	}
	// 매개변수 반복되어도 상관없음, 괄호에서 선언 끝남
	
	/* 기능 : 두 정수가 주어지면 두 정수의 곱을 알려주는 메서드
	 * 리턴타입 : 곱 (int)
	 * 매개변수 : 두 정수 => int num3, int num4
	 * 메서드명 : multiply
	 * */
	
	public static int multiply(int num3, int num4) {
		int result = num3*num4;
		return result;
	}
	
	// 선생님 풀이
	/* 기능 : 두 정수가 주어지면 두 정수의 곱을 알려주는 메서드
	 * 리턴타입 : 곱 (int)
	 * 매개변수 : 두 정수 (int num1, int num2)
	 * 메서드명 : mul
	 * */
	public static int mul(int num1, int num2) {
		return num1*num2;
	}
	
	/* 기능 : 두 정수가 주어지면 두정수의 합을 출력하는 메서드
	 * 리턴타입 : 없음 (void)
	 * 매개변수 : 두정수 (int num1, int num2)
	 * 메서드명 : sum2
	 * */
	
	public static void sum2(int num1, int num2) {
		System.out.println(num1+num2);
		return; // : 값을 준다 / 메서드 빠져나갈 때 사용
	}
	// return = -1일 떄 올지 않습니다와 같이 빠져나올 수 있음
	
	
	
}