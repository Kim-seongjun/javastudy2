package chapter7;

public class Ch7_08_CarExample {

	public static void main(String[] args) {
		// Ch7_08_Car클래스에 대한 객체생성
		// Ch7_08_Car클래스 타입 변수 car 선언
		Ch7_08_Car car = new Ch7_08_Car();

		for (int i = 1; i <= 5; i++) {
			// Ch7_08_Car 객체의 run()메소드 5번 실행
			int problemLocation = car.run();
			switch (problemLocation) {
			// car.run()메소드 실행후
			// 1 이 리턴
			case 1: // 앞왼쪽 타이어가 펑크 났을 때
				System.out.println("앞왼쪽 HankookTire로 교체"); // HankookTire로 교체
				car.frontLeftTire = new Ch7_08_HanKookTire("앞왼쪽", 15);
				break;
			case 2: // 앞오른쪽 타이어가 펑크 났을 때
				System.out.println("앞오른쪽 KumhoTire로 교체"); // KumhoTire로 교체
				car.frontRightTire = new Ch7_08_HanKookTire("앞오른쪽", 13);
				break;
			case 3: // 뒤왼쪽 타이어가 펑크 났을 때
				System.out.println("뒤왼쪽 HankookTire로 교체"); // HankookTire로 교체
				car.backLeftTire = new Ch7_08_HanKookTire("뒤왼쪽", 14);
				break;
			case 4: // 뒤오른쪽 타이어가 펑크 났을 때
				System.out.println("뒤오른쪽 KumhoTire로 교체"); // KumhoTire로 교체
				car.backRightTire = new Ch7_08_HanKookTire("뒤오른쪽", 17);
				break;
			}
			System.out.println("---------------------------"); // 1회전 시 출력되는 내용을 구분
		}

	}

}
