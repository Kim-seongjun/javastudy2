package chapter4;

public class Ch4_20_Exercise2 {

	public static void main(String[] args) {
		/*
		 * for문을 이용해서 1부터 100까지의 정수 중에서
		 * 3의 배수의 총합을 구하는 코드를 작성
		 */
		int sum = 0;
		System.out.println("3의 배수는 ");
		for(int i=1; i<=100;i++) {
			if( i%3==0 ){
				System.out.print(i+" ");
				sum=sum+i; 
			}
		}
		System.out.println();
		System.out.println("3의 배수의 합 = " + sum);
	}
	
}
