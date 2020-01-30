package chapter5;

public class Ch5_07_ArrayInArrayExample2 {

	public static void main(String[] args) {
		/*
		 * 2차원 배열을 사용하여 평점 계산하기
		 */
		double score[][] = {{3.3, 3.4}, 
							{3.5, 3.8},
							{4.2, 4.3},
							{3.9, 4.0}};
		double sum = 0;
		int count = 0;
		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < score[i].length; j++) {
				sum += score[i][j];
				count++;
			}
		}
		double avg = sum / count;
		System.out.println("평점은 " + avg + " 입니다.");
	}

}


