package studentmanager;

import java.util.Scanner;

public class StudentManager implements program {
	
	/* 멤버변수 : 학생 클래스를 배열로 생성[5]
	 * - program 인터페이스를 구현
	 * - 메서드는 interface를 구현하는 형태로... (
	 * - 학생 추가 시 배열이 꽉찼다면... 배열을 늘려주는 기능 추가
	 * */
	
	/* void printStudent(); //학생 전체 리스트 출력
	void insertStudent(Scanner scan); //스케너로 메서드 내부에서 입력받기
	void searchStudent(Scanner scan);  // 없는 경우 => 없습니다.
	void registerSubject(Scanner scan); //누가, 어떤 과목
	void deleteSubject(Scanner scan); // 누가, 어떤 과목 / 없는 경우 => 없습니다. */
	
	Student[] student = new Student[5];
	int cnt = 0;

	//스케너로 메서드 내부에서 입력받기
	@Override
	public void insertStudent(Scanner scan) {
		System.out.println("학생 이름 입력 > ");
		String name = scan.next();
		student[cnt] = new Student(name);
		cnt++;
	}

	//학생 전체 리스트 출력
	@Override
	public void printStudent() {
		for(int i=0; i<cnt; i++) {
			student[i].studentprint();
		}
	}



	//학생 찾기 없는 경우 => 없습니다.
	@Override
	public void searchStudent(Scanner scan) {
		System.out.println("검색할 학생 이름 입력 > ");
		String name = scan.next();
		for(int i=0; i<cnt; i++) {
			if(student[i].getStudentName().equals(name)) {
				student[i].studentprint();
			}
		}
	}

	//누가, 어떤 과목 듣는지 추가
	@Override
	public void registerSubject(Scanner scan) {
		System.out.println("수강 신청할 학생 이름 입력 > ");
		String name = scan.next();		
		for(int i=0; i<cnt; i++) {
			if(student[i].getStudentName().equals(name)) {
				System.out.println("수강 신청 과목 입력 > ");
				String name1 = scan.next();
				student[i].subjectApply(name1);
			}
			
		}
	}
		

	//누가, 어떤 과목 삭제할건지 => 없습니다.
	@Override
	public void deleteSubject(Scanner scan) {
		System.out.println("수강 신청 철회할 학생 이름 입력 > ");
		String name = scan.next();		
		for(int i=0; i<cnt; i++) {
			if(student[i].getStudentName().equals(name)) {
				System.out.println("수강 철회할 과목 입력 > ");
				String name1 = scan.next();
				student[i].subjectDelete(name1);
			}
			
		}
		
	}
	
	
	
	
	
	
	
	
}
