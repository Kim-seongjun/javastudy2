package chapter3;
//삼항연산자
/*
 * 형식  : (조건식) ? 조건이 ture일때의 결과 : 조건이 false일 때의 결과
 */

public class Ch3_12_CoditionalOperatorExample {

	public static void main(String[] args) {
		int score = 95;
		char grade = (score>90) ? 'A':'B';
		//score가 90보다 크면 grade에 A를 저장, 90 보다 작거나 가으면 B를 저장
		System.out.println("당신의 성적은 " + grade + " 입니다");
		
		/*
		 *  int score = 95;
		 *  char grade;
		 *  if(score > 90){
		 *  	grade = 'A';
		 *  } else {
		 *  	grade='B';
		 *  }
		 *  
		 */

	}

}
