package chapter5;

import java.util.Scanner;

public class Ch5_14_Quiz {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String[][] words= {
				{"chair", "의자"},
				{"desk", "책상"},
				{"water", "물"},
				{"book","책"},
				{"pencil","연필"}
		};
		int count=0;
		for(int i=0;i<words.length;i++) {
			System.out.print("문제 "+(i+1)+" "+words[i][0]+"의 뜻은 무엇인가요?  ");
			
			String N = scan.next();
			if(words[i][1].equals(N)) {
				System.out.println("정답입니다.");
				count++;
			}else {
				System.out.println("오답입니다.");
			}
		}System.out.println("총 "+count+"개를 맞췄습니다." );
		System.out.println("정답률은 "+((double)(count)/(double)words.length)*100+" %입니다." );
	}
}


