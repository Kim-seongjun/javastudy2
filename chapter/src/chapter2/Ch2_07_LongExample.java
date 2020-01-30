package chapter2;

public class Ch2_07_LongExample {

	public static void main(String[] args) {
		long var1 = 10;
		long var2 = 20L;
		// long var3 = 1000000000000; //컴파일에러
		long var4 = 1000000000000L;

		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var4);

		/*
		 * 8 라인에서 에러 가 나는 이유는 int 타입의 저장 범위를 넘어서는 정수 리터럴에 'L'을 붙이지 않았기 때문이다.
		 */
	}

}
		/*
		 * long 타입은 8 byte(64bit)로 표현되는 정수값을 저장할 수 있는 데이터 타입
		 *  -2^63 ~ (2^63)-1
		 *  long 타입의 변수를 초기화할 때에는 정수값 뒤에 소문자'l'이나 '대문자L'을 붙일 수 있다
		 *  4byte 정수 데이터가 아니라 8byte 정수 데이터 임을 컴파일러에게 알려주기 위함
		 */