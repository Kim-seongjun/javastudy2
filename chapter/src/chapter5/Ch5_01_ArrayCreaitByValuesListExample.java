package chapter5;

public class Ch5_01_ArrayCreaitByValuesListExample {

	public static void main(String[] args) {

		/*
		 * 배열은 같은 타입의 데이터를 연속된 공간에 나열시키고 
		 * 각 데이터에 인덱스를 부여해 놓은 자료구조이다.
		 * 배열은 같은 타입의 데이터만 저장할 수 있다.
		 */

		/*
		 * 배열선언 : int 타입의 scores라는 배열 변수 선언 
		 * int[] scores; 
		 * scores = new int[] {83,90,87};
		 */
		
		int[] scores = { 83, 90, 87 };
		// 배열 값 접근(출력)

		System.out.println("scores [0]의 값 : " + scores[0]);
		System.out.println("scores [1]의 값 : " + scores[1]);
		System.out.println("scores [2]의 값 : " + scores[2]);

		// 배열 요소들의 합 구하기
		int sum = 0;
		for (int i = 0; i <= 2; i++) {
			sum = sum + scores[i];
		}
		System.out.println("총합  = " + sum);
		double avg = (double) sum / scores.length;
		System.out.println("평균  = " + avg);
	}

}
