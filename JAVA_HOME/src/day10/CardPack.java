package day10;

public class CardPack {

	/* CardPack 클래스
	 * - 카드팩 : 52장의 카드들 (각 모양마다 1장씩)
	 * 
	 * 멤버변수 : 카드를 52장 담을 수 있는 배열
	 * 생성자 : 52장의 카드를 모두 생성
	 * 메서드 : 
	 * - 카드를 섞는 기능
	 * - 카드를 한장 빼내는 기능
	 * - 카드 출력 => Card 클래스의 print 메서드를 사용
	 * - 카드 초기화 메서드
	 * */
	
	//멤버변수
	private Card[] pack = new Card[52];
	private int cnt = 0; // pack 배열의 index를 체크하는 용도 (멤버변수로 만들어서 공유)
	
	//생성자 : 52장의 카드를 모두 생성
	public CardPack() {
		// ♥(1~13) ♣(1~13) ♠(1~13) ◆(1~13)
		char shape='♥';
		for(int i=1; i<=4; i++) {
			switch(i) {
			case 1: shape='♥'; break;
			case 2: shape='♣'; break;
			case 3: shape='♠'; break;
			case 4: shape='◆'; break;
			}
			for(int j=1; j<=13; j++) { //숫자
				Card c = new Card(); // 카드 1장 생성
				c.setShape(shape);
				c.setNum(j);
				pack[cnt] = c;
				cnt++;
			}
		}
	}

 /* 메서드 : 
 * - 카드를 섞는 기능
 * - 카드를 한장 빼내는 기능
 * - 카드 초기화 메서드
 * - 카드 출력 => Card 클래스의 print 메서드를 사용
 */
	
	//카드 섞는 기능 shuffle
	public void shuffle() {
		int a = 0;
		for(int i=0; i<pack.length; i++) {
			Card tmp = null;
			a = (int)(Math.random()*52);
			tmp = pack[i];
			pack[i] = pack[a];
			pack[a] = tmp;
		}
	}
	//선생님 풀이
	public void shuffle_() {
		for(int i=0; i<pack.length; i++) {
			int index = (int)(Math.random()*52)+0;
			Card tmp = pack[i];
			pack[i] = pack[index];
			pack[index] = tmp;
		}
	}
	
	
	
	
	//한장 빼내는 기능
	public Card pickOne() {
		return pack[cnt]; 
	}
	
	//한장 빼내는 기능 pick
	//선생님 풀이
	//리턴타입 Card (카드 1장)
	public Card pick() {
		if(cnt==0) {
			return null;
		}
		cnt--;
		return pack[cnt]; //52
	}
	
	//초기화 기능 : cnt만 마지막으로 다시 보내기
	//선생님 풀이
	public void init() {
		cnt = 52;
	}
	
	//getter / setter
	
	public Card[] getPack() {
		return pack;
	}
	
	public void setPack(Card[] pack) {
		this.pack = pack;
	}
	
	public int getCnt() { //딱히 안만들어도 됨
		return cnt;
	}
	
	public void setCnt(int cnt) {
		this.cnt = cnt;
	}
	
	
}




