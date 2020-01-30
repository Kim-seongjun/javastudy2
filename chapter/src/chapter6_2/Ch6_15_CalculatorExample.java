package chapter6_2;

public class Ch6_15_CalculatorExample {

	public static void main(String[] args) {
		/*
		 * 정적 멤버는
		 * 클래스명.필드;
		 * 클래스명.메소드(매개변수,...);
		 * 로 접근하여 사용 할 수 있다.
		 */
		
		double result1 = 10 * 10 * Ch6_15_Calculator.pi;
		int result2 = Ch6_15_Calculator.plus(10, 10);
		int result3 = Ch6_15_Calculator.minus(10, 10);

		System.out.println("result1 = " + result1);
		System.out.println("result2 = " + result2);
		System.out.println("result3 = " + result3);
		
		// 객체 참조 변수로도 접근이 가능하나 경고 표시가 나타난다.
		Ch6_15_Calculator cal = new Ch6_15_Calculator();
		int result4 = cal.plus(15, 10);
		System.out.println("result4 = " + result4);
	}

}
