package chapter7;

public class Ch7_08_Tire {

	// 필드
	public int maxRotation; // 최대 회전수(타이어 수명)
	public int accRotation; // 누적 회전수
	public String loc; // 타이어 위치

	// 생성자
	public Ch7_08_Tire(String loc, int maxRotation) { // (타이어 위치, 최대 회전수)변수로 갖는 생성자
		this.loc = loc;
		this.maxRotation = maxRotation;
	}

	// 메소드
	public boolean roll() { // 타이어가 1회전 하는 메소드
		++accRotation; // 누적 회전수 1증가
		if (accRotation < maxRotation) { // 누적 회전수 < 최대회전수 일 경우
			System.out.println(loc + " Tire 수명 : " + (maxRotation - accRotation) + " 회");
			return true;
		} else { // 누적 회전수가 최대 회전수 이상일 경우
			System.out.println("*** " + loc + " Tire 펑크 ***");
			return false;
		}
	}

}
