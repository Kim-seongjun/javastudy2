package chapter7;

public class Ch7_03_ComputerExample {

	public static void main(String[] args) {

		int r = 10;

		// 부모 클래스의 메소드 호출
		Ch7_03_Calculator cal = new Ch7_03_Calculator();
		System.out.println("부모클래스의 메소드 호출 : " + cal.areaCircle(r));

		// 자식 클래스의 메소드 호출
		Ch7_03_Computer com = new Ch7_03_Computer();
		System.out.println("자식클래스의 메소드 호출 : " + com.areaCircle(r));

	}

}
