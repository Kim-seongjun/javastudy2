package chapter6_1;

import java.util.Scanner;

public class Ch6_07_ExerciseExample {

	public static void main(String[] args) {
		// Ch6_07_Excercise 객체생성
		// minus 메소드 호출(매개값은 스캐너를 통해 입력) 및 호출 결과 출력.
		// remainder 메소드 호울(매개값은 스캐너를 통해 입력) 및 호출 결과 출력.

		// 작성부분
		Ch6_07_Excercise e = new Ch6_07_Excercise();
		Scanner scan = new Scanner(System.in);

		System.out.print("1번째 수를 입력하세요.>");
		int num1 = scan.nextInt();

		System.out.print("2번째 수를 입력하세요.>");
		int num2 = scan.nextInt();

		// 뺄셈 
		int result1 = 
				
		System.out.println(num1 + " - " + num2 + " = " + result1);
		
		//나머지 구하기
		int result2 = 
				
		System.out.println(num1 + " % " + num2 + " = " + result2);

	}

}
