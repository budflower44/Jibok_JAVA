package day01;

public class 연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 연산자 정리
		/* 대입 연산자 : =, +=(더해서 저장),-= 
		 * = 을 기준으로 오른쪽에 있는 값을 왼쪽의 변수에 저장 (덮어써라)
		 * a = b : b를 a에 넣어라 (저장해라)
		 * a는 반드시 변수여야만 한다. b는 변수여도, 리퍼럴 값이어도 상관없다.
		 * 1=a (x)
		 * a += 1; => a = a + 1; 의 의미가 된다.  // 기존의 a값과 1을 더해서 a에 저장한다는 의미.
		 */
		int a = 1;
		System.out.println(a);
		a = a + 1;
		System.out.println(a);
		a += 1;
		System.out.println(a);
		
		a-=1;
		System.out.println(a);
		
		int b = 10;
		a=b;
		System.out.println(a);
		
		//증감연산자 : ++(1증가) --(1감소)
		a++; // => a = a + 1; 11 같은 의미.
		System.out.println(a);
		System.out.println(a++); // 11 -> 12 / 출력 후 1증가 의미. 
		System.out.println(a);  // 12
		System.out.println(++a);  // 12 -> 13 / 1증가 후 출력 의미.
		
		//사칙연산 / 산술연산자 : + - * / %
		/* 나누기(/)
		 * 정수 / 정수 = 정수 (10/3=3.3333 (x) = 3) 소수점 버림
		 * 정수 / 실수 = 실수 (10/3.0 = 3.33333)
		 * 실수 / 정수 = 실수
		 * 실수 / 실수 = 실수
		 * 값 / 0 => 예외발생
		 * */
		
		System.out.println("3+2="+(3+2));
		System.out.println("3-2="+(3-2));
		System.out.println("3*2="+(3*2));
		System.out.println("3/2="+(3/2));
		System.out.println("3/2="+(3/2.0));
		System.out.println("3%2="+(3%2));
		// % 나머지 연산 : 배수나 약수를 구할 때, 짝수/홀수 구할 때 사용
		
		/* 비교연산자 : 비교연산의 결과는 반드시 true / false
		 * >= (이상), <= (이하), >(초과), <(미만) / 부등호 위치 바뀔 수 없음
		 * ==(같다), !=(같지않다)
		 * () && ()  (and) : 둘 다 true여야 true 리턴
		 * () || () (or) : 둘 중 하나만 true이면 true 리턴
		 *  */
		System.out.println("3>2 ? "+(3>2));
		System.out.println("3<2 ? "+(3<2));
		System.out.println("3==2 ? "+(3==2));
		System.out.println("3!=2 ? "+(3!=2));
		
		System.out.println("&& 연산자 : "+(3>2 && 4<3));
		System.out.println("|| 연산자 : "+(3>2 || 4<3));
		
		/* 조건선택 연산자 : 3항 연산자
		 * (조건식)? ture : false;
		 * */
		System.out.println((3>2)? "참입니다." : "거짓입니다.");
		System.out.println((3<2)? "참입니다." : "거짓입니다.");
		
		/* 문제 : num 값 넣고, num가 짝수인지 홀수인지 출력
		 * 조건선택 연산자를 사용
		 * 짝수란 2로 나누어서 나머지가 0인 값
		 */
		
		int num = 24;
		
		System.out.println(((num%2)!=0)? "num/2는 짝수" : "num/2는 홀수"); // 나: 오답 / 0과 같음이어야 하는데 0과 다름으로 표기함 (출력값 틀림)

		// 선생님 답변
		System.out.println((num % 2==0)? "num/2는 짝수" : "num/2는 홀수");
		//String : 문자열을 저장하는 클래스
		
		String result = (num % 2 ==0)? "짝수" : "홀수"; // 짝수
		System.out.println(num+"은 "+result);
		
		
		
	}

}