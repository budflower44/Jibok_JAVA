package day14;

import java.util.Scanner;

public interface LottoProgram {
	/*- —menu—
	1. 로또 번호 생성(수동) : 사용자가 직접 입력
	    ⇒ createLotto(scan);
	2. 로또 번호 생성(자동) : random (6자리)
	    ⇒ creatLottoAuto()
	3. 당첨 번호 생성(자동) : random (7자리) ⇒ 배열에 저장
	    ⇒ insertLottoAuto()
	4. 당첨 번호 (내역) 확인 : 1개만 확인 ⇒ 등수체크
	    (현재회차 당첨 번호가 가장 위에 출력)
	    ⇒ checkLotto()
	5. 당첨 번호 리스트 확인 : 전부 (마지막 당첨 번호가 가장 위에 출력
	    ⇒ printLotto()
	6. 종료
	*/
	
	void createLotto(Scanner scan); //로또 번호 생성 (수동)
	void createLottoAuto(); //로또 번호 생성 (자동)	
	void insertLottoAuto(); //당첨 번호 생성 (자동)
	void checkLotto(); //당첨 번호 (내역) 확인 
	void printLotto(); // 당첨 번호 리스트 확인
	
}
