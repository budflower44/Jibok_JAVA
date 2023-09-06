package day15;

public class CustomerMain {

	public static void main(String[] args) {
		Customer c = new Customer();
		Customer co = new Customer("지복이", "Siver", 0.01, 0);
		Customer cGold = new Gold("김골드");
		Customer cVIP = new VIP("이브이아이피", 0101);
		
		c.calcPrice(120000);
		c.calcPrice(14000);
		c.customerInfo();
		System.out.println("-------------");
		
		System.out.println("-------------");
		co.customerInfo();
		co.calcPrice(132400);
		co.calcPrice(2400);
		co.customerInfo();
		System.out.println("-------------");
		
		cGold.customerInfo();
		cGold.calcPrice(12384000);
		cGold.calcPrice(34000);
		cGold.customerInfo();
		
		System.out.println("-------------");
		cVIP.customerInfo();
		cVIP.calcPrice(574948);
		cVIP.customerInfo();
		System.out.println("-------------");
		
		CustomerMain cu = new CustomerMain();
		
		Customer[] cuList = new Customer[5];
		int cnt = 0;
		cuList[cnt] = cGold;
		cnt++;
		cuList[cnt] = cVIP;
		cnt++;
		
		System.out.println("---DownCasting---");
		cu.vipDownCasting(cuList, cnt);
		
		
	}
	public void vipDownCasting (Customer[] list, int cnt) {
		for(int i=0; i<cnt; i++) {
			Customer cus = list[i];
			if(cus instanceof VIP) {
				VIP vip = (VIP)cus;
				vip.printInfoVIP();
			}
		}
	}
	
	public void customerInfo1(Customer customer) {
		customer.customerInfo();
	}
	

}