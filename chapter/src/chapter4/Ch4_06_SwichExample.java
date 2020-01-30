package chapter4;

public class Ch4_06_SwichExample {
	
	public static void main(String[] args) {
		
		int num = (int)(Math.random()*6)+1;
		switch(num) {
		case 1: //num==1인 경우
			System.out.println("1번 나왔습니다.");
			break;
		case 2: //num==2인 경우
			System.out.println("2번 나왔습니다.");
			break;
		case 3: //num==3인 경우
			System.out.println("3번 나왔습니다.");
			break;
		case 4: //num==4인 경우
			System.out.println("4번 나왔습니다.");
			break;
		case 5: //num==5인 경우
			System.out.println("5번 나왔습니다.");
			break;
		default: //case가 없는 경우
			System.out.println("6번 나왔습니다.");
		}
		/*
		 * case 끝에 break가 붙어 있는 이유는 다음 case를 실행하지 말고
		 * switch문을 빠져나가기 위해서이다.
		 * break가 없다면 다음 case가 연달아 실행되는데, 이때에는 case 값과는 상관없이 실행된다.
		 */
	}

}
