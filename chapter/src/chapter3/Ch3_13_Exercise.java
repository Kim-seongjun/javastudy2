package chapter3;

import java.util.Scanner;

public class Ch3_13_Exercise {

	public static void main(String[] args) {
		// 1.
		int x = 10;
		int y = 20;
		int z = (++x) + (y--);
		System.out.println("x = "+x+", y = "+y);
		System.out.println("z = "+z);
		
		// 2.
		int score = 85;
		String result = (!(score>90)) ? "가":"나";
		System.out.println(result);
		
		// 3
		Scanner scan = new Scanner(System.in);
		System.out.print("연필은 몇 자루?> ");
		int pencils = scan.nextInt();
		System.out.print("학생은 몇 명?> ");
		int students = scan.nextInt();
		
		//학생한명이 가지는 연필 수
		int pencilPerStudent = pencils/students;
		System.out.println("학생 1명당 연필 "+pencilPerStudent+" 자루");
		
		//남은 연필 수
		int  pencilLeft = pencils%students;
		System.out.println("남은 연필은 "+pencilLeft+ " 자루");
		
		// 4. 십의 자리 이하 버리기 (산술연산자만 사용)
		int value = 356;
		System.out.println((value/100)*100);
		
		//5 사다리꼴 넓이
		int lengthTop = 5;
		int lengthBottom = 10;
		int height = 7;
		double area = ((lengthTop+lengthBottom)*height)/(double)2;
		System.out.println(area);
		
		
		//6 비교연산자 논리 연산자
		int a = 10;
		int b = 5;
		System.out.println( (a>7) && (y<=5) );
		System.out.println( (a%3 == 2) || (y%2 !=1));
	}

}
