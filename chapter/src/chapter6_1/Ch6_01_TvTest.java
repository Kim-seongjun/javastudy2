package chapter6_1;

public class Ch6_01_TvTest {

	public static void main(String[] args) {
		
		//Ch6_01_Tv의 객체를 생성하여 tv에 저장
		Ch6_01_Tv tv = new Ch6_01_Tv();
		
		tv.channel = 7;		// 필드값 channel의 값을 7로 한다.
		tv.channelDown();	// channelDown()을 호출한다.
		
		//채널확인
		System.out.println("현재 채널은 "+tv.channel+" 입니다.");
		

	}

}
