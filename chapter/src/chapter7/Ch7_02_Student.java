package chapter7;

public class Ch7_02_Student extends Ch7_02_People {

	public int studentNo;

	public Ch7_02_Student(String name, String ssn, int studentNo) {
		// this.name=name;
		// this.ssn=ssn;
		super(name, ssn); // 부모클래스의 해당 매개변수를 이용하는 생성자를 바로 호출
		this.studentNo = studentNo;
	}

}
