package studentmanager;

import java.util.Arrays;

class Student {
	
	/* 학생클래스 : 한 학생의 정보를 나타내는 클래스 
	 * = 학번, 이름, 주민번호, 학부, 학과, 과목s(과목클래스를 배열로 생성[5])
	 * - 멤버변수 선언, 생성자, getter/setter, 기타 메서드...
	 * - (학생이 수강을 신청하는 메서드(각 배열을 채우는 메서드/배열이 꽉찼을때 배열 늘리기), 철회하는 메서드(각 배열을 삭제하는 메서드), 기타 출력)
	 * */
	private String classof, studentName, ssNum, faculty, department;
	private Subject[] subjects = new Subject[5];
	private int cnt = 0;
	
	public Student() {}
	public Student(String classof, String studentName, String ssNum, String faculty,
			String department, Subject[] subjects) {
		this.classof = classof;
		this.studentName = studentName;
		this.ssNum = ssNum;
		this.faculty = faculty;
		this.department = department;
		this.subjects = subjects;
	}
	public Student(String studentName) {
		this.studentName = studentName;
	}
	
	
	public void subjectApply(String tmp) {
		subjects[cnt] = new Subject(tmp);
		cnt++;
	}
	
	public void subjectDelete(String tmp) {
		for(int i=0; i<subjects.length; i++) {
			if(new Subject(tmp).equals(tmp)) {
				for(int j=subjects.length; j>i; j--) {
					Subject a = subjects[i];
					subjects[i] = subjects[j];
					subjects[j] = a;
				}
			}
		}
		subjects[cnt] = new Subject(tmp);
	}
	
	// 학생정보 출력
	public void studentprint() {
		System.out.println("학번: "+classof+", 이름: "+studentName+", 주민번호: "+ssNum+", 학부: "+faculty+", 학과: "+department+Arrays.toString(subjects));
	}
	

	public String getClassof() {
		return classof;
	}

	public void setClassof(String classof) {
		this.classof = classof;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getSsNum() {
		return ssNum;
	}

	public void setSsNum(String ssNum) {
		this.ssNum = ssNum;
	}

	public String getFaculty() {
		return faculty;
	}

	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
	public Subject[] getSubjects() {
		return subjects;
	}
	public void setSubjects(Subject[] subjects) {
		this.subjects = subjects;
	}
	
	
}
