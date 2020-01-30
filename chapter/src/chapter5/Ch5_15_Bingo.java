package chapter5;

import java.util.Scanner;

public class Ch5_15_Bingo {

	public static void main(String[] args) {
		int size = 5;
		int x = 0, y = 0, num = 0;
		int[][] bingo = new int[size][size];
		Scanner scan = new Scanner(System.in);

		// 배열의 모든 요소를 1부터 size*size까지의 숫자로 초기화
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				bingo[i][j] = i * size + j + 1;
			}
		}

		// 배열에 저장된 값을 뒤섞는다.
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				x = (int) (Math.random() * size);
				y = (int) (Math.random() * size);

				// bingo[i][j]와 임의로 선택된 값(bingo[x][y])을 바꾼다
				int tmp = bingo[i][j];
				bingo[i][j] = bingo[x][y];
				bingo[x][y] = tmp;
			}
		}

		do {
			for (int i = 0; i < size; i++) {
				for (int j = 0; j < size; j++) {
					System.out.print(bingo[i][j] + "\t");
				}
				System.out.println();
			}
			System.out.println();

			System.out.print("1 ~ " + (size * size) + "의 숫자를 입력하세요.(종료:0)>");
			String tmp = scan.nextLine();
			num = Integer.parseInt(tmp);

			// 입력받은 숫자와 같은 숫자가 저장된 요소를 찾아서 0을 저장
			outer: for (int i = 0; i < size; i++) {
				for (int j = 0; j < size; j++) {
					if (bingo[i][j] == num) {
						bingo[i][j] = 0;
						break outer;
					}
				}
			}
		} while (num != 0);

	}

}
