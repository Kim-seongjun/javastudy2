package chapter2;

public class Ch2_11_CastingExample {

	public static void main(String[] args) {
		
		int intValue = 44032;
		char charValue = (char)intValue;		
		System.out.println("charValue = "+charValue);
		/*
		 * int 타입은 char 타입으로 자동 변환 되지 않기 떄문에 강제 타입 변환을 사용한다.
		 * int 타입에 저장된 값이 유니코드 범위(0~65535)라면 (char) 캐스팅 연산자를
		  * 사용하여 char 타입으로 변환 할 수 있다.
		 * char 타입으로 변환된 값을 출력하면 유니코드에 해당하는 문자가 출력 된다.
		 */
		
		
		long longValue = 500;
		intValue = (int)longValue;				//intValue는 500이 그대로 저장된다
		System.out.println("intValue = "+intValue);
		
		
		double doubleValue = 3.14;
		intValue = (int)doubleValue;			//intValue는 정수 부분인 3만 저장된다
		System.out.println("intValue = "+intValue);
		/*
		 * 실수 타입(float, double)은 정수 타입(byte, short, int, long)으로
		 * 자동변환 되지 않기 때문에 강제 타입 변환을 사용한다.
		 * 소수점 이하 부분은 버려지고, 정수 부분만 저장된다.
		 */
		

	}

}
