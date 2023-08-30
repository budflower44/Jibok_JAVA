package day10;

public class CardMain {

	public static void main(String[] args) {
		CardPack cp = new CardPack();
		//4줄씩 13개로 찍기

		int index = 0;
		cp.shuffle_();
		for(int i=0; i<cp.getPack().length; i++) {
//			cp.shuffle();
			cp.getPack()[i].print();
			index++;
			if(index %13 ==0) {
				System.out.println();
			}
		}
//		cp.pickOne().print();;
		System.out.println("------------------------------");
		Card tmp = cp.pick();
		tmp.print();
		System.out.println();
		System.out.println("------------------------------");
		cp.pick().print();
		
		System.out.println();
		System.out.println("------------------------------");
		cp.init();
		cp.shuffle_();
		for(int i=0; i<cp.getPack().length; i++) {
			cp.getPack()[i].print();
			index++;
			if(index %13 ==0) {
				System.out.println();
			}
		}
		
	}

}
