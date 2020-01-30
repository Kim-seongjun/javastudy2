package list;

import java.util.ArrayList;
import java.util.List;

public class ArrayList_01 {

	public static void main(String[] args) {
		// ArrayList 선언 
		//기본생성자로 ArrayList를 생성하면 내부에 10개의 객체를 저장할 수 있는 초기용량을 갖는다.
		List<String> list = new ArrayList<String>();
		// <> : 제네릭(Generic) (번거로운 타입 변환을 제거해주는 역할)
		/*
		 * 제네릭 사용 전
		 * List list = new ArrayList();		//ArrayList 생성
		 * list.add("java");				//ArrayList에 객체를 추가
		 * Object obj = list.get(0);		//객체 검색
		 * String str = (String)obj;		//타입변환 후 "java" 를 얻음
		 */
		// 리스트객체에 데이터 저장하는 메소드 add()
		list.add("Java");
		list.add("JDBC");
		list.add("Servlet/JSP");
		list.add(2, "Database");
		list.add("MyBatis");
		
		// size() : List에 저장된 객체 수
		int size = list.size();
		System.out.println("list에 저장된 객체 수 = "+size);
		System.out.println();

		String index2 = list.get(2);
		System.out.println("2번인덱스에 담긴 객체 : " + index2);

		// list에 담긴 모든 내용을 반복문 이용하여 출력
		for (int i = 0; i < list.size(); i++) {
			System.out.println("["+i+"] = "+list.get(i));
		}
		System.out.println();
		
		// list에 담긴 데이터 삭제
		list.remove(2);			// (2)번 인덱스 객체 삭제 Datebase
		list.remove(2);			// (2)번 인덱스 객체 삭제 Servlet/JSP
		list.remove("JDBC");	
		for (int i = 0; i < list.size(); i++) {
			System.out.println("["+i+"] = "+list.get(i));
		}
		System.out.println(); 

	}

}
