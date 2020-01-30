package chapter4;

public class Ch4_01_IfExample {

	public static void main(String[] args) {
		int score = 93;
		
		if(score>=90) {
			System.out.println("점수가 90보다 큽니다.");
			System.out.println("등급은 A 입니다.");
		}
		
		if(score <90) 
			System.out.println("점수가 90보다 작습니다.");
			System.out.println("등급은 B 입니다.");
		/*
		 * 13라인의 if문은 {} 중괄호 블록이 없어 14라인 까지만 영향을 미치기 때문에
		 * 들여쓰기만 되어 있을 뿐 if문과는 아무런 관련이 없다.
		 */
			
	}

}


