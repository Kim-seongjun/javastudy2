package chapter3;

public class Ch3_09_SrtongEqualsExample {

	public static void main(String[] args) {
		String strVar1 = "양기두";
		String strVar2 = "양기두";
		//new 연산자 : 새로운 객체를 생성할 때 사용하는 연산자
		String strVar3 = new String("양기두");
		
		System.out.println( strVar1 == strVar2);
		System.out.println( strVar1 == strVar3);
		//false
		// == 연산자는 변수에 저장된 값만 비교하기 때문에 이러한 결과가 나온다.
		
		System.out.println();
		//.equals()
		System.out.println( strVar1.equals(strVar2));
		System.out.println( strVar1.equals(strVar3));
		
		/*
		 * 동일한 String 객체 이건 다른 String 객체이건 상관없이 String
		 * 객체의 문자열만을 비교하고 싶다면 equals() 메소드를 사용
		 * 원본 문자열과 매개값으로 주어진 비교문 자열이 동일한지 비교한 후 
		 * true 또는 false를 리턴한다. 
		 */
	}

}
