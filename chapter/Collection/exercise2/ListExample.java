package exercise2;

import java.util.List;

public class ListExample {
	public static void main(String[] args) {
		/*
		 BoardDao 객체의 getBoardList() 메소드를 호출하면
		 List<Board> 타입의 컬렉션을 리턴한다.
		 ListExample 클래스를 실행시켰을 때 출력될 수 있도록
		 BoardDao의 getBoardList() 메소드를 작성. 
		 */
		BoardDao dao = new BoardDao();
		List<Board> list = dao.getBoardList();
		
		//
		for (int i = 0; i < list.size(); i++) {
			Board board = list.get(i);
			System.out.println("["+i+"] = "+board.getTitle()+"\t"+board.getContent());
		}
		
	}
}
