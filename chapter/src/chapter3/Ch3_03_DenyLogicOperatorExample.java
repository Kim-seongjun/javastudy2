package chapter3;

public class Ch3_03_DenyLogicOperatorExample {

	public static void main(String[] args) {
		//논리 부정 연산자
		boolean play = true;
		System.out.println(play);
		
		play = !play;
		System.out.println(play);
		
		play = !play;
		System.out.println(play);
		
		/*
		 * 논리 부정 연산자는 true를 false로, false는 true로 변경하기 때문에
		 * boolean 타입에만 사용할 수 있다.
		 */

	}

}
