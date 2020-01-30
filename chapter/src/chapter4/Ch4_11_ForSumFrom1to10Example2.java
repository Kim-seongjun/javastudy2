package chapter4;

public class Ch4_11_ForSumFrom1to10Example2 {

	public static void main(String[] args) {
		int sum=0;
		int i = 0;
		
		for(i=1;i<=10;i++) {
			sum += i; 
			System.out.println(i);
		}
		System.out.println(i);
		System.out.println("1 ~ "+(i-1)+" 까지의 합 = "+sum);
	}

}
