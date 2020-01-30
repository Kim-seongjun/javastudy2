package chapter5_2;

public class Ch5_03_ArrayEx3 {

	public static void main(String[] args) {

		int[][] score = { //국어    영어    수학
						  { 30, 40, 50 }, 
						  { 35, 45, 55 }, 
						  { 40, 45, 50 }, 
						  { 45, 50, 55 },
						  { 50, 55, 60 },
						};
		// 과목별 총점
		int korTotal = 0;
		int engTotal = 0;
		int mathTotal = 0;

		System.out.println("번호\t국어\t영어\t수학\t총점\t평균");
		System.out.println("===========================================");

		for (int i = 0; i < score.length; i++) {
			int sum = 0; // 개인별 총점
			int avg = 0; // 개인별 평균

			korTotal += score[i][0]; // 각 행의 첫번째열의 합 = 국어 총점
			engTotal += score[i][1]; // 각 행의 두번째열의 합 = 영어 총점
			mathTotal += score[i][2];// 각 행의 세번째열의 합 = 수학 총점
			System.out.print(i + 1+"\t");

			for (int j = 0; j < score[i].length; j++) {
				sum += score[i][j];
				System.out.print(score[i][j]+"\t");
			}
			avg = sum/score[i].length;
			System.out.print(sum+"\t"+avg);
			System.out.println();
		}
		System.out.println("===========================================");
		System.out.println("총점\t"+korTotal+"\t"+engTotal+"\t"+mathTotal+"\t");
	}

}
