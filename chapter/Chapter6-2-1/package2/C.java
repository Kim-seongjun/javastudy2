package package2;
		// 서로 패키지가 다름
import package1.B;

//public 으로 선언 된 C클래스
public class C {
	
	A a;	//Default 선언된 
			//A 클래스로 접근 불가
	B b;	//Public 선언된 
			//B 클래스로 접근 가능
}
