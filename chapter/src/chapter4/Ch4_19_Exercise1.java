package chapter4;

import java.util.Scanner;

public class Ch4_19_Exercise1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int N;
		int sum=0;
		int i=0;
		
		while(true) {
			System.out.print("숫자를 입력하세요(종료:0)>");
			N = scan.nextInt();
			sum=sum+N;
			i++;
			if(N==0) {
				break;
			}
		}
		System.out.println();
		System.out.println("입력한 수의 개수는 "+(i-1));
		System.out.println("수의 합은 "+sum);
		System.out.println("수의 평균은 "+ sum/(i-1));
		
		scan.close();
		
	}

}
