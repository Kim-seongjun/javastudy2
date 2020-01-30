package chapter3;

public class Ch3_01_SignOperatorExample {

	public static void main(String[] args) {
		//부호연산자
		int x = -100;
		int result1 = +x;
		int result2 = -x;
		System.out.println("result1 = " + result1);
		System.out.println("result2 = " + result2);
		
		short s = 100;
		//short result3 = -s;		//컴파일에러
		int result3 = -s;
		System.out.println("result3 = " + result3);
		/*
		 * 부호 연산자를 사용할 떄 주의할 점은 부호 연산자의 산출 타입은 int 타입이다.
		 * short 타입 값을 부호 연산 하면 int 타입 값으로 바뀐다.
		 */
	}

}
