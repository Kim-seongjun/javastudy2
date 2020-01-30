package chapter3;

public class Ch3_06_StringConcatExample {

	public static void main(String[] args) {
		//문자열 연결 연산자
		//String 문자열을 저장할 수 있는 타입
		String str1 = "JDK" + 8.0;		// str1 = JDK8.0
		String str2 = str1 + "특징";		// str2 = JDK8.0특징
		System.out.println(str2);
		
		String str3 = "JDK" + 3 + 3.0;
		String str4 = 3 + 3.0 + "JDK";
		System.out.println(str3);
		System.out.println(str4);

	}

}
