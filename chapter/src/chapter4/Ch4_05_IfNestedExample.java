package chapter4;

import java.util.Scanner;

public class Ch4_05_IfNestedExample {
	
	public static void main(String[] args) {
		/*
		 * 90점 이상인 점수에 대해 95이상이면 A+
		 * 90점 이상 95점 미만이면 A
		 * 85~89점 B+
		 * 80~84점 B
		 * 75~79점 C+
		 * 70~74점 C
		 * 65~69점 D+
		 * 60~64점 D
		 * 60미만 F
		 * if문이 끝나면 학점을 출력하는 print문 사용
		 * 주의할 점은 학점 값을 처리하는 String 타입의 변수를 하나 사용
		 */
		Scanner scan = new Scanner(System.in);
		System.out.print("점수를 입력하세요.>");
		int score = scan.nextInt();	//60 부터 41개의 수 (60,61,62,...,100)
		
		System.out.println("점수 = " + score);
		
		String G;
		
		if(score>=90) {
			if(score>=95) {
				G="A+";
			}else {
				G="A";
			}
		}else if(score>=80) {
			if(score>=85) {
				G="B+";
			}else {
				G="B";
			}
			
		}else if(score>=70) {
			if(score>=75) {
				G="C+";
			}else {
				G="C";
			}
			
		}else if(score>=60) {
			if(score>=65) {
				G="D+";
			}else {
				G="D";
			}			
		}else {
			G="F";
		}
		
		System.out.println("당신의 학점은 "+G+" 입니다.");
	}

}
