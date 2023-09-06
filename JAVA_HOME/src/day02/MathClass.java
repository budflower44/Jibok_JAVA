package day02;

public class MathClass {

	public static void main(String[] args) {
		/* Math.method(Math가 제공하는 함수)
		 * 반올림(Math.round) : 소수점의 자리수는 무조건 0 / 반올림 후 소수점 날림
		 * Math.ceil 올림 , Math.floor 버림
		 * */
		double num = 34.55555;
		
		// int roundNum = Math.round(num); //return long > 리턴 자료형 달라서 error
		int roundNum = (int)Math.round(num); //return값 중요
		
		System.out.println(Math.round(num));
		System.out.println(Math.ceil(num));
		System.out.println(Math.floor(num));
		
		//Math.max 최대값, Math.min 최소값
		System.out.println(Math.max(5, 3));
		// 어시트턴트 볼 때 자료형 참고/ max (double a, double b) : double - Math 여기에서 double a, double b = 매게 변수, double = 리턴값
		// 이름이 같은 Method가 다른 Class에서 제공할 수 있음
		// Method 범위 내에서는 자료형에 따라서 알아서 반환함
		System.out.println(Math.max(5,3)); 
		System.out.println(Math.min(5,3)); 
		
		//Math.random : 0과 1사이의 아무값을 리턴
		// 0.0<= random <1.0  / ex) 쇼핑몰 옷 사진 무작위 보여주기, 확률 뽑기 등에서 사용됨
		// (int)(Math.random()*10)+1  : 1부터 10개의 정수를 얻는 공식
		System.out.println(Math.random());  // 0은포함, 1은 미포함 (시작은 포함, 끝은 포함하지 않음) / 실횅할 때마다 랜덤값 도출
		System.out.println(Math.random()*10); // 0.0<= <10.0  
		System.out.println((int)(Math.random()*10)); // 0<= <10 (0,1,2,3,4,5,6,7,8,9) / 소수점 버림 (int)형변환  
		System.out.println((int)(Math.random()*10)+1); // 1<= <11 (1,2,3,4,5,6,7,8,10) / 소수점 버림 (int)형변환  
		System.out.println((int)Math.random()*10+1); // Q&A: error 나지 않는 이유? / int 구문이 먼저 실행되서 소수점을 모두다 버려서 '0'이된 상태에서 +1 = 무조건 1 나옴 
		
		
	}

}