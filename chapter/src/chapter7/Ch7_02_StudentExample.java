package chapter7;

public class Ch7_02_StudentExample {

	public static void main(String[] args) {

		Ch7_02_Student student = new Ch7_02_Student("이름", "12345-678910", 5);

		// 부모 클래스 필드
		System.out.println(student.name);
		System.out.println(student.ssn);

		// 자식클래스의 필드
		System.out.println(student.studentNo);

	}

}
