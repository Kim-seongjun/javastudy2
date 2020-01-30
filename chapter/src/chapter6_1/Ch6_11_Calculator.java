package chapter6_1;

public class Ch6_11_Calculator {
	int plus(int x, int y) {
		int result = x + y;
		return result;
	}

	double avg(int x, int y) {
		double sum = plus(x, y); // 2. plus() 호출
		double result = sum / 2;
		return result;
	}

	void execute() {
		double result = avg(7, 10); // 1. avg() 호출
		println("실행결과 : " + result); // 3. println() 호출
	}

	void println(String message) {
		System.out.println(message);
	}

}
