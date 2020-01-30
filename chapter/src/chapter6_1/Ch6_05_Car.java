package chapter6_1;
//생성자(Constructor) Overloading 예제
public class Ch6_05_Car {
	
	//field 선언
	String company="현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	//1. 기본생성자.
	//2. model을 매개변수로 하는 생성자.
	//3. model,color를 매개변수로 하는 생성자.
	//4. model,color,maxSpeed를 매개변수로 하는 생성자.
	
	//1. 기본생성자
	Ch6_05_Car(){
		
	}
	
	//2. model을 매개변수로 하는 생성자.
	Ch6_05_Car(String model){
		this.model=model;
	}
	
	//3. model,color를 매개변수로 하는 생성자.
	Ch6_05_Car(String model, String color) {
		this.model=model;
		this.color=color;
	}
	
	//4. model,color,maxSpeed를 매개변수로 하는 생성자.
	Ch6_05_Car(String model, String color, int maxSpeed) {
		this.model=model;
		this.color=color;
		this.maxSpeed=maxSpeed;
	}

}
