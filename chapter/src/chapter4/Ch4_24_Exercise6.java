package chapter4;

import java.util.Scanner;

public class Ch4_24_Exercise6 {

	public static void main(String[] args) {		
		/*
		 * while문과 Scanner를 이용해서 키보드로부터 
		 * 입력된 데이터로 예금, 출금, 조회, 종료 기능을
		 * 제공하는 코드 작성
		 */
		boolean run = true;
		
		int balance = 0;
		
		Scanner scan = new Scanner(System.in);
		while(run) {
			
			System.out.println("--------------------------------");
			System.out.println("1.예금  || 2.출금  || 3.잔고  || 4.종료");
			System.out.println("--------------------------------");
			System.out.print("선택>");
			int sel = scan.nextInt();
			if(sel==1) {
				System.out.print("예금액>");
				int deposit = scan.nextInt();
				balance=balance+deposit;
				System.out.println("현재잔액은 "+balance+" 입니다.");
			}
			if(sel==2) {
				System.out.print("출금액>");
				int withdraw = scan.nextInt();
				balance=balance-withdraw;
				System.out.println("현재잔액은 "+balance+" 입니다.");
			}
			if(sel==3) {
				System.out.println("현재잔액은 "+balance+" 입니다.");
			}
			if(sel==4) {
				System.out.print("종료합니다.");				
				break;
			}
		}
		scan.close();
	}
}

