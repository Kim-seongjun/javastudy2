package chapter2;

public class Ch2_08_FloatDoubleExample {

	public static void main(String[] args) {
		
		/*
		 * 실수형 변수를 선언하는 타입 double(8 byte), float(4 byte)
		 * 자바는 기본 실수값을 double 타입으로 인지하기 때문에 float 타입의 변수에
		 * 실수를 담기 위해선 값의 끝에 F를 붙여야 함.
		 */
		
		//실수값 저장
		double var1 = 3.14 ;
		//int var2 = 3.14 ;		//컴파일 에러 (Type mismatch)
		float var3 = 3.14F;
		
		//정밀도 테스트
		double var4 = 0.1234567890123456789;
		float var5 = 0.1234567890123456789F;
		System.out.println("var1 = "+var1);
		System.out.println("var3 = "+var3);
		System.out.println("var4 = "+var4);
		System.out.println("var5 = "+var5);
		
		//e 사용하기
		int var6 = 3000000;
		double var7 = 3e6; //3x10^6
		float var8 = 3e6F;
		double var9 = 2e-3; //2x10^-3
		System.out.println("var6 :" + var6);
		System.out.println("var7 :" + var7);
		System.out.println("var8 :" + var8);
		System.out.println("var9 :" + var9);
		
	}

}
