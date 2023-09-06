package day07;

public class Method05 {

	public static void main(String[] args) {
		/* 2~100까지의 소수를 출력
		 * 2~100까지 for문을 돌려서 메서드 호출하여 true라면 출력
		 * */
		for(int i=2; i<=100; i++) {
			if(soo(i)) {
				System.out.print(i+" ");
			}
		}

	}
	
	/* 기능 : 정수가 주어지면 이 정수가 소수인지 아닌지 판단 (true/false)
	 * 소수 : 1과 자기자신만을 약수로 가지는 수
	 * 리턴타입 : boolean
	 * 매개변수 : int num1
	 * 메서드명 : soo
	 * */
	public static boolean soo(int i) {
		boolean su=false; // 안돌아갈 경우를 대비하여 값을 넣어두어야 함. / return 오류남.
		int sou = 0;
		for(int j=1; j<=i; j++) {
			if(i%j==0) {
				sou++;
			}
		}
		if(sou==2) {
			su = true;
		}else {
			su = false;
		}
		return su;
	}


}