package chapter6_2;

public class Ch6_19_ExerciceExample7 {

	public static void main(String[] args) {
		
		Ch6_19_Exercice7 obj1 = Ch6_19_Exercice7.getInstance();
		Ch6_19_Exercice7 obj2 = Ch6_19_Exercice7.getInstance();
		
		if (obj1 == obj2) {
			System.out.println("같은 Ch6_19_Exercice7 객체 입니다.");
		} else {
			System.out.println("다른 Ch6_19_Exercice7 객체 입니다.");
		}

	}

}
