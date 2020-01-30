package chapter7;

public class Ch7_08_HanKookTire extends Ch7_08_Tire {

	// 필드
	// 생성자
	public Ch7_08_HanKookTire(String loc, int maxRotation) { // (타이어 위치, 최대회 전수)
		super(loc, maxRotation); // 부모 클래스의 생성자 호출
	}

	// 메소드
	@Override
	public boolean roll() {
		++accRotation; // 누적 회전수 1증가
		if (accRotation < maxRotation) {
			System.out.println(loc + " HanKookTire 수명 : " + (maxRotation - accRotation) + " 회");
			return true;
		} else {
			System.out.println("*** " + loc + " HanKookTire 펑크 ***");
			return false;
		}
	}

}
