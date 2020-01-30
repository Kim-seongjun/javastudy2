package chapter4;

import java.util.Scanner;

public class Ch4_25_Exercise7 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("1~50 UP & Down GAME");
		System.out.println();
		
		int answer = (int)(Math.random()*50) + 1;
		int input;
		
		int i=0;
		do {
			System.out.print("숫자를 입력하세요.>");
			input = scan.nextInt();
				if(input>answer) {
					System.out.println(input+" 보다 작다.");
				}else if(input<answer) {
					System.out.println(input+" 보다 크다.");
				}
			i++;
		} while( ! (input==answer));
		System.out.println("정답입니다.");
		System.out.println("당신은 "+i+" 번의 시도를 하였습니다.");
		scan.close();

	}

}
