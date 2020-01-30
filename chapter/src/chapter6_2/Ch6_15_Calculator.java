package chapter6_2;

public class Ch6_15_Calculator {
	/*
	 *  정적(static)은 고정된 이란 의미를 갖는다
	 *  정적 멤버는 클래스에 고정된 멤버로서 
	 *  객체를 생성하지 않고 사용할 수 있는 필드와 메소드를 말한다
	 *  각각 정적 필드, 정적 메소드라고 부른다
	 */
	/*
	 * 객체 별로 가지고 있어야 할 데이터라면 
	 * 인스턴스 필드로 선언하고
	 * 객체 마다 가지고 있을 필요성이 없는 
	 * 공용적인 데이터라면 정적 필드로 선언 하는 것이 좋다.
	 */
	
	// 인스턴스 필드
	String color;		//계산기별로 색상이 다를 수 있다.
	
	// static 필드선언
	static double pi = 3.14159;		//계산기에서 사용하는 
									//파이의 값은 모두 동일하다.
	
	// static 메소드 선언
	static int plus(int x, int y) {
		return x + y;
	}

	static int minus(int x, int y) {
		return x - y;
	}
}
