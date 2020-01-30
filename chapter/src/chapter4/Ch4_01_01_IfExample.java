package chapter4;

import java.util.Scanner;

public class Ch4_01_01_IfExample {

	public static void main(String[] args) {
		int input;
		System.out.print("숫자를 입력하세요.>");
		Scanner scan = new Scanner(System.in);
		
		String tmp = scan.nextLine();	//입력받은 내용을 tmp에 저장
		input = Integer.parseInt(tmp);  //int형으로 변환해 input에 담기
		
		if(input ==0) {
			System.out.println("입력한 숫자는 0입니다.");
		}
		
		if(input != 0) {
			System.out.println("입력한 숫자는 0 이 아닙니다.");
			System.out.println("입력한 숫자는 " + input +" 입니다.");
		}
		
		/*
		if(input == 0) {
			System.out.println("입력한 숫자는 0입니다.");
		}else {
			System.out.println("입력한 숫자는 0 이 아닙니다.");
			System.out.println("입력한 숫자는 " + input +" 입니다.");
		}
		*/

	}

}
