package studentmanager;

import java.util.Scanner;

public class StudentManager_선생님풀이 implements Program_선생님풀이{
	/* 멤버변수 : 학생 클래스를 배열로 생성[5]
	 * - program 인터페이스를 구현
	 * - 메서드는 interface를 구현하는 형태로... (
	 * - 학생 추가 시 배열이 꽉찼다면... 배열을 늘려주는 기능 추가
	 * */
	
	private Student_선생님풀이[] std = new Student_선생님풀이[5];
	private int stdCount; //std 배열의 index를 처리하기 위한 변수
	
	@Override
	public void printStudent() {
		System.out.println("--전체 학생 정보--");
		for(int i=0; i<stdCount; i++) {
			std[i].stdPrint(); //학생의 정보만 출력
			std[i].subPrint(); //수강정보 추가
			System.out.println("----------------");
		}
	}

	@Override
	public void insertStudent(Scanner scan) {
		//1명의 정보값을 입력받아 객체를 생성한 후 std 배열에 추가
		System.out.println("--학생정보입력--");
		System.out.println("이름 > ");
		String name = scan.next();
		System.out.println("학번 > ");
		String num = scan.next();
		System.out.println("주민번호 > ");
		String sNum = scan.next();
		System.out.println("학부 > ");
		String f = scan.next();
		System.out.println("학과 > ");
		String m = scan.next();
		System.out.println("-------------");
		
		//입력받은 값으로 객체를 생성
		Student_선생님풀이 s = new Student_선생님풀이(num, name, sNum, f, m);
		//배열이 꽉 찼다면 배열복사 후 배열 이동
		if(stdCount == std.length) {
			Student_선생님풀이[] tmp = new Student_선생님풀이[std.length+5]; //새배열
			//arraycopy 이용하여 배열 복사
			System.arraycopy(std, 0, tmp, 0, std.length);
			std = tmp;
		}
		//배열에 등록
		std[stdCount] = s; //0번지
		stdCount++; // 인원증가 = 1
		
	}

	@Override
	public void searchStudent(Scanner scan) {
		// 검색할 학생의 이름을 입력받아 배열에서 탐색 후 있다면
		// 학생정보와 수강정보를 출력
		System.out.println("검색할 학생이름 입력 > ");
		String serachName = scan.next();
		
		//int index = -1; //찾은 학생의 배열 주소 입력
		for(int i=0; i<stdCount; i++) {
			if(std[i].getStdName().equals(serachName)) {
				std[i].stdPrint();
				std[i].subPrint();
				return;
				//index = i;
			}
		}
		//if(intdex == -1) {
			System.out.println("검색한 이름이 없습니다.");
		//}
		
	}

	@Override
	public void registerSubject(Scanner scan) {
		// 누가 수강신청을 할 것인가?
		//수강 신청할 학생 이름을 받기
		int index = -1;
		System.out.println("수강신청 학생명 > ");
		String name = scan.next();
		//학생의 위치 체크
		for(int i=0; i<stdCount; i++) {
			if(std[i].getStdName().equals(name)) {
				index = i;
				break;
			}
		}
		//입력한 학생이 없다면?
		if(index == -1) {
			System.out.println("학생정보가 없습니다.");
		}else {
			//있으면 신청과목 접수받기
			System.out.println("수강신청 과목 > ");
			String subName = scan.next();
			//객체를 생성하여
			Subject_선생님풀이 s = new Subject_선생님풀이(subName);
			//insertSubject 호출
			std[index].insertSubject(s);
		}
		
	}

	@Override
	public void deleteSubject(Scanner scan) {
		//수강 철회할 학생명 입력받기
		int index = -1;
		System.out.println("수강철회 학생명 > ");
		String name = scan.next();
		//그 학생의 위치 정보
		for(int i=0; i<stdCount; i++) {
			if(std[i].getStdName().equals(name)) {
				index = i;
				break;
			}
		}
		//학번이 없다면...
		if(index == -1) {
			System.out.println("학생정보가 없습니다.");
		}else {
			//취소할 과목명 입력받기
			System.out.println("취소할 과목명 > ");
			String sName = scan.next();
			std[index].deleteSubject(sName);
		}
		
	}

}
