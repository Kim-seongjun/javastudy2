package chapter2;
//변수의 사용 범위
public class Ch2_02_VariableScopeExample {

	public static void main(String[] args) {
		// 15를 변수 v1의 초기값으로 저장
		int v1 = 15;
		
		if(v1>10) {
			//변수 V2를 if 블록 안쪽 에서 선언
			int v2 = v1 - 10;
			int v3 = v1 + v2 + 5;
			
			System.out.println("v1="+v1);
			System.out.println("v1="+v2);
			System.out.println("v3="+v3);
		}
		
		//변수 v3를 if블록 바깥쪽에서 선언
	}			     //v2 변수를 사용 할 수 없기 때문에 컴파일 에러가 생김
					  /*제어문 블록에서 선언된 변수는 
						해당 제어문 블록 내에서만 사용이 가능하다*/
	
}
