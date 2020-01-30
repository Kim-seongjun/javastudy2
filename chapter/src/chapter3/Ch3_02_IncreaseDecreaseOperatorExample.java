package chapter3;

public class Ch3_02_IncreaseDecreaseOperatorExample {

	public static void main(String[] args) {
		//증감연산자
		int x = 10;
		int y = 10;
		int z;
		
		System.out.println("------------------------------");
		System.out.println("x = " + x);
		x++;
		System.out.println("x = " + x);
		++x;
		System.out.println("x = " + x);
		
		System.out.println("------------------------------");
		System.out.println("y = " + y);
		y--;
		System.out.println("y = " + y);
		--y;
		System.out.println("y = " + y);
		
		System.out.println("------------------------------");
		z = x++;
		System.out.println("z = " + z);
		System.out.println("x = " + x);
		
		System.out.println("------------------------------");
		z = ++x;
		System.out.println("z = " + z);
		System.out.println("x = " + x);
		
		System.out.println("------------------------------");
		z = ++x + y++;		
		System.out.println("z = " + z);
		System.out.println("x = " + x);
		System.out.println("y = " + y);

	}

}
