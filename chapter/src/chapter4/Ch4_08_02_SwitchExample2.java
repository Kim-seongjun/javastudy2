package chapter4;

import java.util.Scanner;

public class Ch4_08_02_SwitchExample2 {

	public static void main(String[] args) {
		int score = 0;		//점수를 저장하기 위한 변수
		char grade = ' ';	//학점을 저장하기 위한 변수. 공백으로 초기화.
		System.out.print("점수를 입력하세요.(1~100)>");
		Scanner scan = new Scanner(System.in);
		
		score = scan.nextInt();
		
		switch(score/10) {
		case 10:
		case 9:
			grade='A';
			break;
		case 8:
			grade='B';
			break;
		case 7:
			grade='C';
			break;
		default :
			grade='F';
		}
		System.out.println("당신의 학점은 "+grade+" 입니다.");
	}

}
