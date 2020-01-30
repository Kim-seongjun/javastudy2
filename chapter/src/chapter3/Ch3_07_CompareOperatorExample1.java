package chapter3;

public class Ch3_07_CompareOperatorExample1 {

	public static void main(String[] args) {
		/*
		 * 비교연산자 종류
		 * 비교연산자는 연산 결과가 무조건 true,false로 나옴.
		 * == : 양변이 같으면 true 다르면 false
		 * != : 양변이 다르면 true 같으면 false
		 * >, >=, <, <=
		 */
		int num1 = 10;
		int num2 = 10;
		boolean result1 = (num1 == num2); //true
		boolean result2 = (num1 != num2); //false
		boolean result3 = (num1 <= num2); //true
		System.out.println("result1 = "+result1);
		System.out.println("result2 = "+result2);
		System.out.println("result3 = "+result3);
		
		char char1 = 'A';		//65
		char char2 = 'B';		//66
		boolean result4 = (char1 < char2);
		System.out.println("result4 = "+result4);
		

	}

}
