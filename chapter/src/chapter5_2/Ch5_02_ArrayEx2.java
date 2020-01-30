package chapter5_2;

public class Ch5_02_ArrayEx2 {

	public static void main(String[] args) {
		
		//2차원 배열의 모든 요소의 합 구하기
		
		int[][] score = { 
						  { 100, 100, 100 }, 
						  { 20, 20, 20 },
						  { 30, 30, 30 },
						  { 40, 40, 40 }
						};
		int sum = 0;
		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < score[i].length; j++) {
				System.out.println("score[" + i + "][" + j + "] = " + score[i][j]);
			}
		}
		
		//배열의 합 
		for(int i = 0;i<score.length;i++) {
			for(int j = 0;j<score[i].length;j++) {
				sum = sum + score[i][j];
			}
		}
		
		/*
		for (int[] tmp : score) {
			for (int i : tmp) {
				sum += i;
			}
		}
		*/

		System.out.println("sum = " + sum);
	}
}
