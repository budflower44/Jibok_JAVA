package day12;

public class Class06 {

	public static void main(String[] args) {
		
		EzenStudent es = new EzenStudent("철수", 5, "010-6689-4485");
		es.print();
		
	}

}

/* 멤버변수 : 지점, 이름, 반, 전화번호
 * 생성자 
 * 메서드 : 출력(print 메서드)
 * getter/setter
 * */
class EzenStudent{
	public final static String branch = "인천";
	private String name;
	private int room;
	private String phone;
	
	public EzenStudent() {}
	public EzenStudent(String name, int room, String phone) {
		this.name = name;
		this.room = room;
		this.phone = phone;
	}
	
	public void print() {
		System.out.println("지점: "+branch+" 이름: "+name+" 반: "+room+" 전화번호: "+phone);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRoom() {
		return room;
	}
	public void setRoom(int room) {
		this.room = room;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
}