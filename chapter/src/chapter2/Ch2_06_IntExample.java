package chapter2;

public class Ch2_06_IntExample {
	
	public static void main(String[] args) {
		int var1 = 10;		//10진수로 저장
		int var2 = 012;		//8진수로 저장
		int var3 = 0xA;		//16진수로 저장
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);
	}
}		
		// int  타입은 4byte(32bit)로 표현되는 정수값을 저장할 수 있는 데이터 타입
		// -2^31 ~ (2^31)-1
		/*
		 *  int 타입은 자바에서 정수 연산을 하기 위한 기본 타입
		 *  byte 타입 또는 short 타입의 변수를 + 연산하면
		 *  int 타입으로 변환된 후 연산되고 결과 역시 int 타입이 된다.
		 */