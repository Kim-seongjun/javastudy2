package chapter6_1;

public class Ch6_03_CarExample {

	public static void main(String[] args) {
		
		//Ch6_03_Car myCar = new Ch6_03_Car();		//기본 생성자를 호출할 수 없다
		// 기본 생성자가 아닌 다른 생성자를 통해 객체 생성
		
		Ch6_03_Car myCar1 = new Ch6_03_Car("검정",3000);
		//String color ="검정", int cc = 300으로 초기화하면서 객체 생성.
		
		Ch6_03_Car myCar2 = new Ch6_03_Car("빨강",2000);
		Ch6_03_Car myCar3 = new Ch6_03_Car("흰색",4500);
		
		

	}

}
