package chapter6_1;
//생성자 Overloading 예제
public class Ch6_05_CarExample {

	public static void main(String[] args) {
		//1. 기본 생성자를 이용한 객체 생성하여 필드값 출력
		
		//2. model 매개변수 갖는 생성자를 이용한 객체 생성하여 필드값 출력.
		//3. model,color 매개변수 갖는 생성자를 이용한 객체 생성하여 필드값 출력.
		//4. model,color,maxSpeed 매개변수 갖는 생성자를 이용한 객체 생성하여 필드값 출력.
		
		//1. 기본 생성자를 이용한 객체 생성하여 필드값 출력
		Ch6_05_Car myCar1 = new Ch6_05_Car();
		System.out.println("myCar1.company : "+myCar1.company);
		System.out.println("myCar1.model : "+myCar1.model);
		System.out.println("myCar1.color : "+myCar1.color);
		System.out.println("myCar1.maxSpeed : "+myCar1.maxSpeed);
		System.out.println();
		
		//2. model 매개변수 갖는 생성자를 이용한 객체 생성하여 필드값 출력.
		Ch6_05_Car myCar2 = new Ch6_05_Car("자가용");
		System.out.println("myCar2.company : "+myCar2.company);
		System.out.println("myCar2.model : "+myCar2.model);
		System.out.println("myCar2.color : "+myCar2.color);
		System.out.println("myCar2.maxSpeed : "+myCar2.maxSpeed);
		System.out.println();
		
		Ch6_05_Car myCar3 = new Ch6_05_Car("자가용","빨강");
		System.out.println("myCar3.company : "+myCar3.company);
		System.out.println("myCar3.model : "+myCar3.model);
		System.out.println("myCar3.color : "+myCar3.color);
		System.out.println("myCar3.maxSpeed : "+myCar3.maxSpeed);
		System.out.println();
		
		Ch6_05_Car myCar4 = new Ch6_05_Car("택시","검정",200);
		System.out.println("myCar4.company : "+myCar4.company);
		System.out.println("myCar4.model : "+myCar4.model);
		System.out.println("myCar4.color : "+myCar4.color);
		System.out.println("myCar4.maxSpeed : "+myCar4.maxSpeed);
		System.out.println();
		
		
		

	}

}
