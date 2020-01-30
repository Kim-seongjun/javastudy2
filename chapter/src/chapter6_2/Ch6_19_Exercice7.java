package chapter6_2;

public class Ch6_19_Exercice7 {
	
	/*
	 Ch6_19_Exercice7 객체를 싱긍톤으로 만들고 싶다.
	 Ch6_19_ExerciceExample7 클래스에서 
	 Ch6_19_Exercice7의 getInstance()메소드로 싱글톤을
	  얻을 수 있도록 Ch6_19_Exercice7 클래스를 작성
	 */
	// 작성 위치
	private static Ch6_19_Exercice7 ex7 = new Ch6_19_Exercice7();

	private Ch6_19_Exercice7() {

	}

	static Ch6_19_Exercice7 getInstance() {
		if (ex7 == null) {
			ex7 = new Ch6_19_Exercice7();
		}
		return ex7;
	}

}
