package chapter6_1;

public class Ch6_10_Car {
	//필드 선언
	int gas;
	
	//생성자
	
	//메소드
	//리턴값이 없는 메소드로 매개값을 받아서 gas 필드값을 변경.
	void setGas(int gas) {
		this.gas=gas;
	}
	
	/*
	 * 리턴값이 boolean인 메소드로 gas필드 값이 0이면 false를
	 * 0이 아니면 true를 리턴
	 */
	boolean isLeftGas() {
		if(gas==0) {
			System.out.println("gas가 없습니다.");
			return false;
		}
		System.out.println("gas가 있습니다.");
		return true;
	}
	
	void run() {
		while(true) {
			if(gas>0) {
				System.out.println("달립니다. (gas 잔량 : "+gas+")");
				gas -= 1;
			}else {
				System.out.println("멈춤니다. (gas 잔량 : "+gas+")");
				return;		//run()메소드 종료
			}
		}
	}
	
}
