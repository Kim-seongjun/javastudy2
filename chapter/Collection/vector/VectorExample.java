package vector;

import java.util.List;
import java.util.Vector;

public class VectorExample {
	public static void main(String[] args) {
		//Vector는 ArrayList와 동일한 내부 구조를 가지고 있다
		List<Board> list = new Vector<Board>();
	
		list.add(new Board("이름1", "연락처1", "주소1"));
		list.add(new Board("이름2", "연락처2", "주소2"));
		list.add(new Board("이름3", "연락처3", "주소3"));
		list.add(new Board("이름4", "연락처4", "주소4"));
		list.add(new Board("이름5", "연락처5", "주소5"));
		
		list.remove(2);		//[2]번 인덱스 객체 삭제(이름3,...) 뒤의 인덱스는 1씩 앞으로 당겨짐
		list.remove(3);		//[3]번 인덱스 객체 삭제(이름5,...)
			
		for(int i=0; i<list.size(); i++) {
			Board board = list.get(i);
			System.out.println(board.name + "\t" + board.tel + "\t" + board.addr);
		}
	}
}

