package chapter4;

public class Ch4_13_ForMultipleicationTableExample {

	public static void main(String[] args) {
		
		for(int x=2; x<=9; x++) {
			System.out.print("*** " + x +" 단 ***\t");
		}
		for(int i=1; i<=9; i++) {
			System.out.println();
			for(int j=2;j<=9;j++) {
				System.out.print(j+" * "+i +" = " + i*j);
				System.out.print("\t");
			}
		}
	}
}
