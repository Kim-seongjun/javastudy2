package chapter7;

public class Ch7_06_sportsCar extends Ch7_06_Car {

	@Override
	public void speedUp() {
		speed += 10;
	}
	
	//부모클래스의 final 메소드는 오버라이딩을 할 수 없다.
	@Override
	public void stop() {
		System.out.println("스포츠카가 멈춥니다.");
		speed = 0;
	}
}
