package package4;

import package3.A;

public class C {

	// 필드
	A a1 = new A(true); 	// public 접근 가능
	A a2 = new A(1); 		// default 접근 불가
	A a3 = new A("문자열"); 	// private 접근 불가
}
