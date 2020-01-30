package chapter6_1;

public class Ch6_12_CarExample {

	public static void main(String[] args) {

		Ch6_12_Car myCar = new Ch6_12_Car();
		myCar.keyTurnOn();
		myCar.run();
		int speed = myCar.getSpeed();
		System.out.println("현재속도 : " + speed + "km/h");

	}

}
