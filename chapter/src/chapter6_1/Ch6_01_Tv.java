package chapter6_1;

//클래스 선언
public class Ch6_01_Tv {
	
	//Tv의 필드값
	String color;			// Tv의 색상
	boolean power;			// 전원상태(On/Off)
	int channel;			// 채널
	
	//Tv의 기능(메소드)
	void power() {			// Tv를 켜거나 끄는 기능을 하는 메소드
		power = !power;
	}
	void channelUp() {		// Tv의 채널을 높이는 기능을 하는 메소드
		channel = channel + 1;
	}
	void channelDown() {	// Tv의 채널을 낮추는 기능을 하는 메서드
		channel = channel - 1;
	}
	

}
