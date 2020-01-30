package chapter5;

public class Ch5_12_lottoNum {

	public static void main(String[] args) {

		// 로또번호 생성 예제
		int[] ball = new int[45];

		// 배열의 각 요소에 1~45의 값을 저장한다.
		for (int i = 0; i < ball.length; i++) {
			ball[i] = i + 1;
		}

		int temp = 0; // 두 값을 바꾸는데 사용할 임시변수
		int j = 0; // 임의의 값을 얻어서 저장할 변수

		// 배열의 i번째 요소와 임의의 요소에 저장된 값을 소로 바꿔서 값을 섞는다
		// 0번째 부터 5번쨰 요소까지 모두 6개만 바꾼다.

		for (int i = 0; i < 6; i++) {
			j = (int) (Math.random() * 45); // 0~44
			temp = ball[i];
			ball[i] = ball[j];
			ball[j] = temp;
		}

		// 배열의 ball 앞에서 부터 6개의 요소를 출력.
		for (int i = 0; i < 6; i++) {
			System.out.println("ball[" + i + "] = " + ball[i]);
		}
	}

}
