package day07;

public class Method06_선생님풀이 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		gugu(3);
		System.out.println();
		
		// 보충 필요
		
		
	}
	
	/* 기능 : 단어 주어지면 그 단의 구구단을 출력(리턴 x)
	 * 2*2=4
	 * 2*3=6
	 * ...
	 * 2*9=18
	 * */
	public static void gugu(int num) {
		for(int i=1; i<=9; i++) {
			System.out.printf("%d * %d = %d%n", num, i, (num*i));
		}
	}
	
}