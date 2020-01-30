package chapter2;

public class Ch2_13_FromIntToFloat {

	public static void main(String[] args) {
		int num1 = 123456780;
		int num2 = 123456780;
		
		float num3 = num2;
		num2 = (int)num3;
		
		int result = num1 - num2;
		System.out.println(result);
		
		/*
		 * int 값을 float 타입으로 자동 변환하면서 문제가 발생한다.
		 */
	}

}
