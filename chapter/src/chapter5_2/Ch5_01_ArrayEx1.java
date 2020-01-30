package chapter5_2;

public class Ch5_01_ArrayEx1 {

	public static void main(String[] args) {
		// 2차원 배열			    행   열
		int[][] array1 = new int[2][3];	// arr 열	[0]열      [1]열       [2]열
										//	[0]행  |		 |		 |		 |
										//	[1]행  |		 |		 |		 |
		//배열에 값 부여
		array1[0][0] = 1;
		array1[0][1] = 2;
		array1[0][2] = 3;
		array1[1][0] = 4;
		array1[1][1] = 5;
		array1[1][2] = 6;
		System.out.println("array1");
		for (int i = 0; i < array1.length; i++) {
			System.out.print(i + "행 : ");
			for (int j = 0; j < array1[i].length; j++) {
				System.out.print(array1[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();

		// 2차원 배열에서 생성과 동시에 값을 부여하기 위해서는 중괄호를 사용.
		int[][] array2 = new int[][] { { 1, 2, 3 }, { 4, 5, 6, 7 } };
		System.out.println("arr2.length = " + array2.length);
		// 2차원 배열에서 배열명.length 값은 행 값이다.

		for (int i = 0; i < array2.length; i++) {
			System.out.print(i + "행 : ");
			for (int j = 0; j < array2[i].length; j++) {
				System.out.print(array2[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();

		/////////////////////////////
		int[][] array3 = new int[2][];
		array3[0] = new int[3];
		array3[1] = new int[5];
		////////////////////////////

		int num = 1;
		for (int x = 0; x < array3.length; x++) {
			System.out.print(x + "행 : ");
			for (int y = 0; y < array3[x].length; y++) {
				array3[x][y] = num;
				System.out.print(array3[x][y] + " ");
				num++;
			}
			System.out.println();
		}

	}

}
