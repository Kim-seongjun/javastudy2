package chapter4;

public class Ch4_23_Exercise5 {

	public static void main(String[] args) {
		/*
		 * for 문을 이용해서
		 * 
		 * 	*
		 * 	**
		 * 	***
		 * 	****
		 * 	*****
		 * 
		 * 와 같은 삼각형을 출력하는 코드 작성
		 */
		for(int i=1; i<=5; i++) {
			for(int j=2; j<=i; j++) {
				System.out.print("*");
			};
			System.out.println("*");
		}
	}

}
