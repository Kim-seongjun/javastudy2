package list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayList_02 {

	public static void main(String[] args) {
		//고정된 객체들로 구성된 List 생성
		List<String> list1 = Arrays.asList("자바","스프링","오라클");
		for (int i = 0; i < list1.size(); i++) {
			System.out.println("["+i+"] = "+list1.get(i));
		}
		System.out.println();
		
		
		List<Board> list2 = new ArrayList<Board>();
		list2.add(new Board("제목1","내용1","작성자1"));
		
		Board bo = new Board("제목2","내용2","작성자2");
		list2.add(bo);
		for (int i = 0; i < list2.size(); i++) {
			Board board = list2.get(i);
			System.out.println("["+i+"] = "+board.subject+"\t"+board.content+"\t"+board.writer+"\t");
		}
		
	}

}
