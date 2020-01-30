package chapter6_1;
//StudentExample 클래스
public class Ch6_01_StudentExample {

	public static void main(String[] args) {
		//객체 생성 연습
		//Student 클래스의 객체 생성
		//s1이라는 이름을 갖는 Student 클래스의 객체를 생성
		
		Ch6_01_Student s1 = new Ch6_01_Student();
		System.out.println("s1 변수가 Ch6_01_Student 객체를 참조합니다.");
		
		Ch6_01_Student s2 = new Ch6_01_Student();
		System.out.println("s2 변수가 또 다른 Ch6_01_Student 객체를 참조합니다.");
		
		/*
		 * Ch6_01_Student클래스는 하나이지만 new 연산자를 사용한 만큼 각각의 객체가 메모리에 생성된다
		 */
		//s1과 s2가 참조하는 Ch6_01_Student객체는 완전히 독립된 서로 다른 객체이다.
	}

}
