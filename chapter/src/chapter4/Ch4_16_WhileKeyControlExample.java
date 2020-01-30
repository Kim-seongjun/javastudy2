package chapter4;

import java.util.Scanner;

public class Ch4_16_WhileKeyControlExample {

	public static void main(String[] args) {
		boolean run = true;
		
		int speed = 0;
		
		Scanner scan = new Scanner(System.in);
		
		while(run) {
			System.out.println("--------------------");
			System.out.println("1.증속 | 2.감속 | 3.종료");
			System.out.println("--------------------");
			System.out.print("메뉴를 선택해 주세요 >");
			String input = scan.nextLine();
			int keyCode = Integer.parseInt(input);
			System.out.println();
			if(keyCode == 1) {
				speed++;
				System.out.println("현재속도 = " + speed+"\n");
			} else if(keyCode == 2) {
				speed--;
				System.out.println("현재속도 = " + speed);
				System.out.println();
			} else if(keyCode == 3) {
				run = false;
			}else {
				System.out.println("잘못된 입력 입니다.");
			}
		}
		System.out.println("프로그램 종료");
		scan.close();
	}

}
