package day07;

public class Method04 {

	public static void main(String[] args) {
		/* 메서드 : 기능을 하기 위한 코드 조각
		 * 
		 * 접근제한자 리턴타입 메서드명(매개변수) {
		 * 코드;
		 * return; 
		 * ... (실행X)
		 * }
		 * 
		 * (이론) return ; 메서드에서 전달해야하는 값을 전달하는 역할
		 * (실제) 메서드에서 return을 만나면 리턴 타입의 값을 전달하고, 메서드를 종료
		 * (실제) 메서드를 종료해야할 때 사용  // 조건을 종료해야할 때
		 * */
		
		/* 1. 랜덤(1~100) 정수 5개를 배열에 담는 메서드 (정수 배열을 리턴)
		 * 2. 배열을 전달받아서 평균을 연산하는 메서드 (평균을 리턴)
		 * 3. 배열의 정수 5개와 평균을 출력하는 메서드 (출력) 리턴x
		 * 메인에서는 연산식이 있으면 안됨.
		 * 메서드간의 데이터 전달 및 호출만 있어야 함.
		 * 
		 * 카페에 제출
		 * */
		int arr[] = ran();
		double avg = avg(arr);
		print(arr, avg);
		
	}
	
	/* 1. 랜덤(1~100) 정수 5개를 배열에 담는 메서드 (정수 배열을 리턴)
	 * 리턴타입 : int
	 * 매개변수 : num1, num2, num3, num4, num5
	 * 메서드명 : ramdom
	 * */
	public static int[] ran() {
		int[] ran = new int[5];
		for(int i=0;i<ran.length;i++) {
			ran[i] = (int)(Math.random()*100)+1;
		}
		return ran;
	}
	
		
	/* 2. 배열을 전달받아서 평균을 연산하는 메서드 (평균을 리턴)
	 * 리턴타입 : double
	 * 매개변수 : 
	 * 메서드명 : avg
	 * */
	
	public static double avg(int ran[]) {
		double avg = 0;
//		int random[] = new int[5];
//		random = ran();
		int sum =0;
		for(int i=0;i<ran.length; i++) {
			sum += ran[i];
		}
		avg = sum/5;
		return avg;
	}
	
	
	
	/* 3. 배열의 정수 5개와 평균을 출력하는 메서드 (출력) 리턴x
	 * 리턴타입 : void
	 * 매개변수 : 
	 * 메서드명 : print
     * */
	public static void print(int ran[], double avg) {
//		int[] rann = ran(); // 위에 있는 ran 함수랑 값이 다름 / 방법을 모르겠음.
//		for(int d=0; d<rann.length; d++) {
//			System.out.print(rann[d]+" ");
//		}		
		for (int d : ran) {
			System.out.println(d+" ");
		}
		System.out.println();
		System.out.println(avg);
	}
	

}