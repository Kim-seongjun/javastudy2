package chapter2;

public class Ch2_09_BooleanExample {

	public static void main(String[] args) {
		
		/*
		 * 불타입(Boolean)변수는 ture, false의 값 만 가질 수 있음.
		 * true = 1, false = 0 으로 인식
		 */
		//bool 타입의 stop 변수 선언.
		boolean stop = false;
		
		if(stop) {
			System.out.println("중지합니다.");
		}else {
			System.out.println("시작합니다.");
		}
	}

}
