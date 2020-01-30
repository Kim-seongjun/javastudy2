package chapter2;

public class Ch2_10_Promotionexample {

	public static void main(String[] args) {
		byte bytevalue = 10 ;
		int intValue = bytevalue ;		//int <ㅡ byte
		//기존 byte 타입의 변수가 int 타입으로 자동 타입변환
		System.out.println(intValue);
		
		char charValue = '가';
		intValue = charValue;			//int <- char
		System.out.println("가의 유니코드는=" + intValue);
		
		intValue = 500;
		long longValue = intValue;		//long <- int
		System.out.println(longValue);
		
		intValue = 200;					
		double doubleValue = intValue;	//double <- int
		System.out.println(doubleValue);

	}

}
