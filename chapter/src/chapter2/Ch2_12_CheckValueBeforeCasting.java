package chapter2;

public class Ch2_12_CheckValueBeforeCasting {

	public static void main(String[] args) {
		int i = 128;
		
		if( (i<Byte.MIN_VALUE) || (i>Byte.MAX_VALUE) ) {
			System.out.println("byte 타입으로 변환할 수 없습니다.");
			System.out.println("값을 다시 확인해 주세요");
		}else {
			byte b = (byte)i;
			System.out.println(b);
		}
		/*
		 * 8라인에 사용된 연산식과 if문은 
		 * 변수 i의 값이 byte 타입의 최소값 보다 작은지, 
		 * 최대값 보다 큰지를 조사해서 하나라도 해당이 된다면
		 * 9~10 라인은 실행 시키고 그렇지 않다면 12~13라인을 실행시킨다.
		 */

	}

}
