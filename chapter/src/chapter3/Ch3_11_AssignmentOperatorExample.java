package chapter3;
//대입연산자
/*
 * +=, -=, /=, %=
 * A+=b => A=A+B
 */
public class Ch3_11_AssignmentOperatorExample {

	public static void main(String[] args) {
		int result = 0;
		result += 10;
		System.out.println("result = "+result);//10
		result -= 5;
		System.out.println("result = "+result);//5
		result *= 3;
		System.out.println("result = "+result);//15
		result /= 5;
		System.out.println("result = "+result);//3
		result %= 3;
		System.out.println("result = "+result);//0

	}

}
