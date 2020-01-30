package chapter7;
//자동타입변환 예제(자식클래스타입 ㅡ> 부모클래스타입)

//A클래스 선언
class A {
}

//A클래스의 자식클래스인 B클래스를 선언		
class B extends A { // A -> B
}

//A클래스의 자식클래스인 C클래스 선언
class C extends A { // A -> C
}

//B클래스의 자식클래스인 D클래스 선언
class D extends B { // A -> B -> D
}

//C클래스의 자식클래스인 E클래스 선언
class E extends C { // A -> C -> E
}

public class Ch7_07_PromotionExample {
	public static void main(String[] args) {
		// B클래스 타입의 변수 b선언
		B b = new B();
		// C클래스 타입의 변수 c선언
		C c = new C();
		// D클래스 타입의 변수 d선언
		D d = new D();
		// E클래스 타입의 변수 e선언
		E e = new E();

		// 각각 선언한 변수들에 대한 자동 형변환 여부 확인
		// A클래스 타입의 변수에 B클래스 타입 변수 대입
		A a1 = b;
		// A클래스 타입의 변수에 C클래스 타입 변수 대입
		A a2 = c;
		// A클래스 타입의 변수에 D클래스 타입 변수 대입
		A a3 = d;
		// A클래스 타입의 변수에 E클래스 타입 변수 대입
		A a4 = e;

		B b1 = d;
		C c1 = e;

		B b2 = e;
		C c2 = b;

	}

}
