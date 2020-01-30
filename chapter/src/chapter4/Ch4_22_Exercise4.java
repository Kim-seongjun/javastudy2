package chapter4;

public class Ch4_22_Exercise4 {

	public static void main(String[] args) {
		/*
		 * 문제 : 방정식 2x + 4y = 10의 모든 해를 구하시오.
		 * 0 <= x, y <= 10 이고 모두 정수이다.
		 */
		for(int x=0; x<=10;x++) {
			for(int y=0; y<=10; y++) {
				if(2 * x + 4 * y == 10) {
					System.out.println("x= "+x+ " y= "+y);
				}
			}
		}
	}

}
