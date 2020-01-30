package chapter7;

public class Ch7_08_Car {

	// 필드 //타이어 위치에 따른 4개의 객체생성 (타이어위치, 최대회전수)

	Ch7_08_Tire frontLeftTire = new Ch7_08_Tire("앞왼쪽", 6);
	Ch7_08_Tire frontRightTire = new Ch7_08_Tire("앞오른쪽", 2);
	Ch7_08_Tire backLeftTire = new Ch7_08_Tire("뒤왼쪽", 3);
	Ch7_08_Tire backRightTire = new Ch7_08_Tire("뒤오른쪽", 4);
	
	// 위의 내용을 배열로 나타내면
	// Tire 클래스 타입의 배열변수를 선언해서 우변에 있는 내용을 배열변수에 대입
	/*
	Ch7_08_Tire[] myTire = { 
			new Ch7_08_Tire("앞왼쪽", 6), new Ch7_08_Tire("앞오른쪽", 2), 
			new Ch7_08_Tire("뒤왼쪽", 3), new Ch7_08_Tire("뒤오른쪽", 4) };
	*/
	
	// 메소드
	int run() {
		System.out.println("[자동차가 달립니다.]");
		if (frontLeftTire.roll() == false) { 	// Tire 객체의 roll()메소드 실행 후
												// false를 리턴하는 경우
			stop(); 	// stop()메소드 실행	
			return 1; 	// 앞왼쪽 타이어가 펑크임을 1을 리턴하여 알림
		} // 해당 타이어 번호를 리턴
		if (frontRightTire.roll() == false) {
			stop();
			return 2;
		}
		if (backLeftTire.roll() == false) {
			stop();
			return 3;
		}
		if (backRightTire.roll() == false) {
			stop();
			return 4;
		}
		return 0;
	}

	void stop() {
		System.out.println("자동차가 멈춥니다.");
	}

}
