package chapter6_1;

public class Ch6_02_CarExample {

	public static void main(String[] args) {
		//Ch6_02_Car 클래스 객체 생성
		Ch6_02_Car myCar = new Ch6_02_Car();
		
		//Ch6_02_Car 클래스 에서 선언한 필드 값 읽기
		//Ch6_02_Car 클래스의 company 필드값
		System.out.println("제작 회사 : "+ myCar.company);
		//Ch6_02_Car 클래스의 model 필드값
		System.out.println("모델명 : "+ myCar.model);
		//Ch6_02_Car 클래스의 color 필드값
		System.out.println("색상 : "+ myCar.color);
		//Ch6_02_Car 클래스의 maxSpeed 필드값
		System.out.println("최고 속도 : "+ myCar.maxSpeed);
		//Ch6_02_Car 클래스의 speed 필드값
		System.out.println("현재 속도 : "+ myCar.speed);
		
		//필드값 변경
		myCar.speed = 60;
		System.out.println("수정된 속도 : "+ myCar.speed);

	}

}
