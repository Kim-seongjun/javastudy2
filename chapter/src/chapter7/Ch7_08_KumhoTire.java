package chapter7;

public class Ch7_08_KumhoTire extends Ch7_08_Tire {

	// 필드
	// 생성자
	public Ch7_08_KumhoTire(String loc, int maxRotation) {
		super(loc, maxRotation);
	}

	// 메소드
	@Override
	public boolean roll() {
		++accRotation; // 누적 회전수 1증가
		if (accRotation < maxRotation) {
			System.out.println(loc + " KumhoTire 수명 : " + (maxRotation - accRotation) + " 회");
			return true;
		} else {
			System.out.println("*** " + loc + " HanKookTire 펑크 ***");
			return false;
		}
	}

}
