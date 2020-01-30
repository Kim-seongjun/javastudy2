package chapter5;

import java.util.Scanner;

public class Ch5_13_Excercise6 {

	public static void main(String[] args) {
		/*
		 *  학생 수와 각 학생들의 점수를 입력 받아서
		 *  최고 점수 및 평균 점수를 구하는 코드 작성
		 */
		
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner scan = new Scanner(System.in);

		while (run) {

			System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
			System.out.println("| 1.학생수  | 2.점수입력  | 3.점수리스트  | 4.분석  | 5.종료  |");
			System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");

			System.out.print("선택>");

			int selectNo = scan.nextInt();

			if (selectNo == 1) {
				//작성위치
				
			} else if (selectNo == 2) {
				//작성위치
				
			} else if (selectNo == 3) {
				//작성위치
				
			} else if (selectNo == 4) {
				//작성위치
				
			} else if (selectNo == 5) {
				run = false;
			} 
		}
	}
}