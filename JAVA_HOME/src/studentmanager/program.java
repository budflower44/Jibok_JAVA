package studentmanager;

import java.util.Scanner;

public interface program {
	/* 1. 인터페이스 
    - 학생 리스트 출력 메서드
    - 학생을 추가 메서드
    - 학생을 검색 메서드
    - 학생의 수강신청 메서드 (수강 추가)
    - 학생의 수강철회 메서드 (수강 삭제)*/
	
	void printStudent(); //학생 전체 리스트 출력
	void insertStudent(Scanner scan); //스케너로 메서드 내부에서 입력받기
	void searchStudent(Scanner scan);  // 없는 경우 => 없습니다.
	void registerSubject(Scanner scan); //누가, 어떤 과목
	void deleteSubject(Scanner scan); // 누가, 어떤 과목 / 없는 경우 => 없습니다.
	
}
