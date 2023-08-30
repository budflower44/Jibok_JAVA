package day01;

public class 과제IF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 매일 마지막 시간 과제 출제
		 * 카페에 제출
		 * 국어, 영어, 수학의 점수 합계와 평균을 출력
		 * 조건선택 연산자 이용하여 
		 * 평균이 80이상이면 결과: 합격, 아니면 결과 : 불합격 출력
		 */
		int kor, eng, math;
		kor = 78;
		eng = 98;
		math = 77;
		int sum = kor+eng+math;
		double avg = (sum/3);
		System.out.println("합계 : "+(sum));
		System.out.println("평균 : "+(avg));
		System.out.println((avg>=80)? "합격":"불합격");
		
		// 문제: 조건선택 연산자 => if문 변경
		if(avg>=80) {
			System.out.println(avg+" : 합격");
		}else {
			System.out.println(avg+" : 불합격");
		}
// 선생님 답변
		if(avg >= 80) {
			System.out.println("결과 : 합격");
		}else {
			System.out.println("결과 : 불합격");
	}

}
}