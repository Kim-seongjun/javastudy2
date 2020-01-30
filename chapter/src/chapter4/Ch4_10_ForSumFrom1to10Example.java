package chapter4;

public class Ch4_10_ForSumFrom1to10Example {

	public static void main(String[] args) {
		
		int sum=0;
		
		for(int i=1; i<=10; i++) {
			System.out.println(sum);
			System.out.println("----------");
			sum += i; 
		}
		System.out.println("1 ~ 10 까지의 합 = "+sum);
		
	}

}
