package chapter6_1;

import java.util.Scanner;

public class Ch6_09_ExcerciseExample2 {

	public static void main(String[] args) {

		/*
		 * 3열짜리 1차원 배열을 선언하고 
		 * 스캐너를 이용하여 값을 하나하나 입력하고 
		 * 입력한 값의 총 합 및 평균 값을 Ch6_09_Excercise2
		 * 의 메소드를 이용하여 구하시오
		 */

		// Ch6_09_Excercise2 객체생성
		Ch6_09_Excercise2 e = new Ch6_09_Excercise2();
		Scanner scan = new Scanner(System.in);
		// 배열 생성
		int[] scores = new int[3];

		// 생성된 배열에 값 저장
		System.out.println("정수 3개를 입력하세요.");
		for (int i = 0; i < scores.length; i++) {
			System.out.print((i + 1) + " 번째 수를 입력하세요.>");
			int num = scan.nextInt();
			scores[i] = num;
		}
		
		System.out.println("입력한 수의 총합은 " );
		System.out.println("입력한 수의 평균은 " );
		System.out.println("입력한 수의 평균은 " );
	}

}
