package day15;

public class Customer {
	/* 고객 클래스
	 * 고객 등급 : 일반고객 / Gold고객 / VIP고객
	 * 
	 * 멤버변수
	 * 고객 ID : int customerID
	 * 고객이름 : String customerName
	 * 고객등급 : String customerGrade
	 * 보너스포인트 : int bonusPoint
	 * 보너스포인트적립비율 : double bonusRatio
	 * 할인비율 : double saleRatio
	 * 
	 * - Customer 객체 생성시
	 * 기본 customerGrade = Silver
	 * 기본 bonusRatio = 0.01
	 * 
	 * - 메서드
	 * - 보너스 적립 계산 메서드(메서드명 : calcPrice(int price))
	 *   => 보너스를 적립하고, 할인여부 체크하여 구매 price 리턴 (할인 적용한 금액 리턴)
	 *   구매금액을 주고, 적립보너스계산, bonusPoint 누적, 실 구매금액 리턴
	 *   
	 * - 출력 메서드 (메서드명 : customerInfo())
	 *   홍길동님의 등급은 VIP이며, 보너스 포인트는 1000입니다.
	 *   전담 상담사 번호는 111입니다. - VIP만 출력
	 *   
	 * - Silver등급
	 *   제품을 살때 할인 없음. / 보너스포인트 1% 적립
	 *   
	 * - Gold 등급
	 *   제품을 구매할때 10% 할인 / 보너스포인트 2% 적립
	 *   
	 * - VIP등급
	 *   제품을 구매할때 20% 할인 / 보너스포인트 5% 적립
	 *   전담상담사를 갖는다. (int agentID)
	 * */
	
	//멤버변수
	protected int customerID;
	protected String customerName;
	protected String customerGrade;
	protected int bonusPoint;
	protected double bonusRatio;
	protected double saleRaito;
	int cnt; //누적 구매 횟수
	int finalPrice = 0;
	
	//생성자
	public Customer() {
		this.customerGrade = "Siver";
		this.bonusRatio = 0.01;
		this.saleRaito = 0;
	}

	public Customer(int customerID, String customerName, String customerGrade, int bonusPoint, double bonusRatio,
			double saleRaito) {
		super();
		this.customerID = customerID;
		this.customerName = customerName;
		this.customerGrade = customerGrade;
		this.bonusPoint = bonusPoint;
		this.bonusRatio = bonusRatio;
		this.saleRaito = saleRaito;
	}
	
	public Customer(String customerGrade, double bonusRatio) {
		this.customerGrade = customerGrade;
		this.bonusRatio = bonusRatio;
	}
	
	public Customer(String customerName) {
		this.customerName = customerName;
	}
	
	public Customer(String customerName, String customerGrade, double bonusRatio, double saleRatio) {
		this.customerName = customerName;
		this.customerGrade = customerGrade;
		this.bonusRatio = bonusRatio;
		this.saleRaito = saleRatio;
	}
	
	//메서드
	/* - 메서드
	 * - 보너스 적립 계산 메서드(메서드명 : calcPrice(int price))
	 *   => 보너스를 적립하고, 할인여부 체크하여 구매 price 리턴 (할인 적용한 금액 리턴)
	 *   구매금액을 주고, 적립보너스계산, bonusPoint 누적, 실 구매금액 리턴
	 */
	
	public int calcPrice(int price) {
		bonusPoint += (int) (price*bonusRatio);
		System.out.println(bonusPoint+"점의 보너스가 적립되었습니다.");
		finalPrice = (int)((price/100)*(100-saleRaito));
		cnt++;
		System.out.println("할인 적용 구매가: "+finalPrice);
		return finalPrice;
	}

	 /* - 출력 메서드 (메서드명 : customerInfo())
	 *   홍길동님의 등급은 VIP이며, 보너스 포인트는 1000입니다.
	 *   전담 상담사 번호는 111입니다. - VIP만 출력
	 */
	public void customerInfo() {
		System.out.println(customerName+"님의 등급은 "+customerGrade+"이며, 보너스 포인트는 "+bonusPoint+"점 입니다.");
	}

	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public int getBonusPoint() {
		return bonusPoint;
	}

	public void setBonusPoint(int bonusPoint) {
		this.bonusPoint = bonusPoint;
	}

	public double getSaleRaito() {
		return saleRaito;
	}

	public void setSaleRaito(double saleRaito) {
		this.saleRaito = saleRaito;
	}

	public String getCustomerGrade() {
		return customerGrade;
	}

	public double getBonusRatio() {
		return bonusRatio;
	}

	public int getCnt() {
		return cnt;
	}

	public int getFinalPrice() {
		return finalPrice;
	}
	
	
}

/* - Silver등급
 *   제품을 살때 할인 없음. / 보너스포인트 1% 적립
 *   
 * - Gold 등급
 *   제품을 구매할때 10% 할인 / 보너스포인트 2% 적립
 *   
 * - VIP등급
 *   제품을 구매할때 20% 할인 / 보너스포인트 5% 적립
 *   전담상담사를 갖는다. (int agentID)
 */

class Gold extends Customer{
	public Gold() {
		super.customerGrade = "Gold";
		super.bonusRatio = 0.02;
		super.saleRaito = 10;
	}
	
	public Gold(String customerName) {
		super.customerName = customerName;
		super.customerGrade = "Gold";
		super.bonusRatio = 0.02;
		super.saleRaito = 10;
	}
	
	
}


class VIP extends Customer{
	private int agentID;
	
	public VIP() {
		super.customerGrade = "VIP";
		super.bonusRatio = 0.05;
		super.saleRaito = 10;
	}
	
	public VIP(String customerName, int agentID) {
		super.customerName = customerName;
		super.customerGrade = "VIP";
		super.bonusRatio = 0.05;
		super.saleRaito = 10;
		this.agentID = agentID;
	}

	public void printInfoVIP() {
		customerInfo();
		System.out.println(customerName+"님의 전담상담사는 "+agentID+" ID 넘버 입니다.");
	}

	public int getAgentID() {
		return agentID;
	}

	public void setAgentID(int agentID) {
		this.agentID = agentID;
	}
	
	
}