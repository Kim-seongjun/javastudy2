package chapter6_2;
//싱글톤 
public class Ch6_18_Singleton {
	
	/*
	 * 전체 프로그램에서 단 하나의 객체만 만들도록
	 * 보장해야 하는 경우 단 하나만 생성된다고 해서
	 * 이 객체를 싱글톤(Singleton) 이라고 한다.
	 */
	
	/*
	 * 싱글톤을 만들려면 클래스 외부에서 
	 * new 연산자로 생성자를 호출할 수 없도록 막아야 한다.
	 * (생성자를 호출한 만큼 객체가 생성되기 때문에)
	 * 외부에서 생성자를 호출 할 수 없도록
	 * 생성자 앞에 private 접근 제한자를 붙여준다.
	 */
	
	/*
	 *  1. 자신의 타입인 정적 필드를 선언하고 
	 *  자신의 객체를 생성해 초기화 한다.
	 *  이 때 private을 붙여 외부에서 필드값에 접근하지 못하도록 한다.
	 */
	
	// 정적 필드	
	private static Ch6_18_Singleton singleton = new Ch6_18_Singleton();

	// 생성자
	private Ch6_18_Singleton() {

	}
	
	/*
	 * 2. 외부에서 호출 할 수 있도록 getInstance() 를 선언 하고
	 * getInstance()가 호출됬을 때 정적 필드에서 
	 * 참조하는 자신의 객체를 리턴해준다.
	 */
	
	// 정적 메소드 singleton 인스턴스를 얻기 위한
	static Ch6_18_Singleton getInstance() {

		if (singleton == null) {

			singleton = new Ch6_18_Singleton();
		}
		return singleton;
	}
	
	/*
	 * 외부에서 객체를 얻는 유일한 방법은
	 * getInstance() 메소드를 호출
	 */
	
}
