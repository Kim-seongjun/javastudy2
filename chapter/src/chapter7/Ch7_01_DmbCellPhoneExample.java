package chapter7;

public class Ch7_01_DmbCellPhoneExample {

	public static void main(String[] args) {

		// DmbCellPhone에 대한 객체 생성
		Ch7_01_DmbCellPhone myPhone = new Ch7_01_DmbCellPhone("아이폰", "블랙", 10);

		// 생성한 객체의 model, color, channel 값을 각각 출력
		// model, color 필드는 부모 클래스에서 선언
		// Ch7_01_CellPhone에서 상속받은 필드
		System.out.println("모델 : " + myPhone.model);
		System.out.println("색상 : " + myPhone.color);

		// Ch7_01_DmbCellPhone의 필드
		System.out.println("채널 : " + myPhone.channel);

		// 부모 클래스에서 선언한 메소드 각각 호출
		myPhone.PowerOn();
		myPhone.PowerOff();
		myPhone.bell();
		myPhone.sendVoice("뭐해");
		myPhone.receiveVoice("자바수업중이야");
		myPhone.hangUp();

		// 자식클래스에서 선언한 메소드 각각 호출
		myPhone.turnOnDmb();
		myPhone.changeChannelDmb(7);
		myPhone.turnOffDmb();

	}

}
