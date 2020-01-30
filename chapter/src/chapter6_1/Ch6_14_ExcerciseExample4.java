package chapter6_1;

import java.util.Scanner;

public class Ch6_14_ExcerciseExample4 {

	public static void main(String[] args) {
		
		Ch6_14_Excercise4 ex4 = new Ch6_14_Excercise4();
		//스캐너로 ID,PW 입력
		Scanner scan = new Scanner(System.in);
		System.out.println("ID>");
		String id = scan.next();
		System.out.println("PW>");
		String pw = scan.next();
		
		boolean result = ex4.login(id, pw);
		if(result) {
			System.out.println("로그인 되었습니다.");
			ex4.logout();
		} else {
			System.out.println("id 또는 pw 가 일치 하지 않습니다.");
		}
	}

}
