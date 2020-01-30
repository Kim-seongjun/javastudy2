package chapter5;

public class Ch5_10_AdvancedForExample2 {

	public static void main(String[] args) {
		
		int[] num = { 1, 2, 3, 4, 5 };
		String[] fruits = { "사과", "배", "바나나", "체리", "딸기", "포도" };
		int sum = 0;
		// for -each문
		for (int i : num) {
			sum = sum + i;
			System.out.print(i + " ");
		}
		System.out.println("정수 총합 : " + sum);

		for (String fruit : fruits) {

			System.out.print(fruit + " ");
		}

	}

}
