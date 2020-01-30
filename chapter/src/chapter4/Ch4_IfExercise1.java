package chapter4;

import java.util.Scanner;

public class Ch4_IfExercise1 {

	public static void main(String[] args) {
		
		//세 정수 A, B, C가 주어진다. 이때, 두 번째로 큰 정수를 출력하는 프로그램을 작성하시오. 
		
		//첫째 줄에 세 정수 A, B, C가 공백으로 구분되어 주어진다. (1 ≤ A, B, C ≤ 100)
		
		
		
		Scanner scan = new Scanner(System.in);
		int A = scan.nextInt();
		int B = scan.nextInt();
		int C = scan.nextInt();
		if (A > B) {
			if (A > C) {
				if (B > C) {
					System.out.println(B);
				} else {
					System.out.println(C);
				}
			} else {
				System.out.println(A);
			}
		}
		if (B >= A) {
			if (B > C) {
				if (A > C) {
					System.out.println(A);
				} else {
					System.out.println(C);
				}

			} else {
				System.out.println(B);
			}
		}
	}

}
