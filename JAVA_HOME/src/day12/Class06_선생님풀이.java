package day12;

public class Class06_선생님풀이 {
	
	public static void main(String[] args) {
		
		EzenStudent_선생님풀이 es = new EzenStudent_선생님풀이("서울", "홍길동", "자바", "1111");
		//객체를 출력하면 자동으로 toString메서드를 호출
		System.out.println(es);
		EzenStudent_선생님풀이 es1 = new EzenStudent_선생님풀이();
		System.out.println(es1);
		
	}

}
/* 멤버변수 : 지점, 이름, 반, 전화번호
 * 생성자 
 * 메서드 : 출력(print 메서드) => toString메서드
 * getter/setter
 * */

/* 객체를 초기화 하는 방법 : 기본값(null, 0), 명시적 초기값, 초기화 블럭, 생성자
 * 1. 명시적 초기화 : 멤버변수의 선언과 동시에 초기값을 명시
 * 2. 초기화 블럭 : {} 멤버변수를 초기화
 * 3. 생성자 : 객체를 초기화 하는 방법
 * 초기화 우선순위
 * 기본값 -> 명시적 초기값 -> 초기화블럭 -> 생성자
 * */

class EzenStudent_선생님풀이{
	
	//명시적 초기값
	private String gigum="인천";
	private String name="미상";
	private String group;
	private String tel;
	
	{
		//초기화 블럭
		gigum="incheon";
		group="미정";
	}
	
	//생성자
	public EzenStudent_선생님풀이() {}


	public EzenStudent_선생님풀이(String gigum, String name, String group, String tel) {
//		super();
		this.gigum = gigum;
		this.name = name;
		this.group = group;
		this.tel = tel;
	}
	

	public String getGigum() {
		return gigum;
	}


	public void setGigum(String gigum) {
		this.gigum = gigum;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getGroup() {
		return group;
	}


	public void setGroup(String group) {
		this.group = group;
	}


	public String getTel() {
		return tel;
	}


	public void setTel(String tel) {
		this.tel = tel;
	}


	@Override //어노레이드 (부모가 제공해주는걸 상속받아서 쓴다)
	public String toString() {
		return "EzenStudent [gigum=" + gigum + ", name=" + name + ", group=" + group + ", tel=" + tel + "]";
	}
	
	
}