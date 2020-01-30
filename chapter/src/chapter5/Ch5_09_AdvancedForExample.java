package chapter5;

public class Ch5_09_AdvancedForExample {

	public static void main(String[] args) {
		/*
		 * 향상된 for문(foe each문)
		 * 
		 * for( 2.타입변수 : 1.배열) {
		 * 		3. 실행문
		 * }
		 * 
		 * a. 1.배열에서 가져올 첫번째 값이 존재하는지 평가
		 * b. 가져올 값이 존재하면 해당 값을 2.변수에 저장
		 * c. 3.실행문을 실행
		 * d. 3.실행문이 모두 실행되면 다시 루프를 돌아
		 * e. 1.배열에서 가져올 다음 값이 존재하는지 평가
		 * f. 다음 항목이 존재하면 b,c,d,e 로 진행 후
		 * g. 다음 항목이 없으면  for문 종료
		 * 
		 */
		
		int[] scores = { 95, 85, 90, 66, 88 };
		int sum = 0;
		
		// for -each문
		int i = 0;
		for (int score : scores) {
			sum = sum + score;
			System.out.println("scores[" + i + "] = " + score);
			i++;
		}

		double avg = (double) sum / scores.length;
		System.out.println("점수 총합 : " + sum);
		System.out.println("점수 평균 : " + avg);
	}

}
