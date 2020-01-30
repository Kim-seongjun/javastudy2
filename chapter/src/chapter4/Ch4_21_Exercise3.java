package chapter4;

public class Ch4_21_Exercise3 {

	public static void main(String[] args) {
		/*
		 * while문과 Math.random() 메소드를 이용해서 
		 * 두개의 주사위를 던졌을 때 나오는 눈을
		 * (눈1, 눈2) 형태로 출력하고
		 * 눈의 합이 5가 아니면 계속 주사위를 던지고,
		 * 눈의 합이 5이면 실행을 멈추는 코드 작성 
		 */
		boolean run = true;
		while(run) {
			int dice1 = (int) (Math.random() * 6) + 1;
			int dice2 = (int) (Math.random() * 6) + 1;
			System.out.println("( "+dice1+" , "+dice2+" )");
			int sum = dice1+dice2;
			if(sum==5) {
				run = false;
			}
		}
	}

}
