package chapter6_2;

public class Ch6_18_SingletonExample {

	public static void main(String[] args) {
		//일반적인 객체 생성하는 방식
		/*
		 Ch6_17_Singleton obj1 = new Ch6_17_Singleton();  // 컴파일 에러
		 Ch6_17_Singleton obj2 = new Ch6_17_Singleton();  // 컴파일 에러
		 */
		
		//싱글톤으로 선언한 클래스를 사용하는 방식
		Ch6_18_Singleton obj1 = Ch6_18_Singleton.getInstance();
		Ch6_18_Singleton obj2 = Ch6_18_Singleton.getInstance();
		System.out.println("obj1 = " + obj1);
		System.out.println("obj2 = " + obj2);
		if (obj1 == obj2) {
			System.out.println("같은 singleton 객체 입니다.");
		} else {
			System.out.println("다른 singleton 객체 입니다.");
		}

		Ch6_18_Test test1 = new Ch6_18_Test();
		Ch6_18_Test test2 = new Ch6_18_Test();
		System.out.println("test1 = " + test1);
		System.out.println("test2 = " + test2);
		if (test1 == test2) {
			System.out.println("같은 객체 입니다.");
		} else {
			System.out.println("다른 객체 입니다.");
		}
	}

}
