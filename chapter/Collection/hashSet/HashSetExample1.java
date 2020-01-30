package hashSet;

import java.util.*;

public class HashSetExample1 {
	public static void main(String[] args) {
		//HashSet은 객체들을 순서 없이 저장하고 동일한 객체는 중복 저장하지 않는다
		Set<String> set = new HashSet<String>();

		set.add("Java");
		set.add("JDBC");
		set.add("Servlet/JSP");
		set.add("Java");		//Java는 한번만 저장된다.
		set.add("MyBATIS");

		int size = set.size();	//저장된 객체 수 얻기
		System.out.println("Set에 담긴 총 객체 수 : " + size);

		// Set에 들어있는 모든 데이터 가져오기
		// 반복자(Iterator) 사용
		Iterator<String> iterator = set.iterator();		//반복자 얻기
		while (iterator.hasNext()) {				//hasNext() : 가져올 객체가 있으면 true 없으면 false
			String element = iterator.next();			//하나의 객체를 가져온다.
			System.out.println("\t" + element);
		}

		set.remove("JDBC");
		set.remove("MyBATIS");

		System.out.println("Set에 담긴 총 객체 수 : " + set.size());
		iterator = set.iterator();						//반복자 얻기
		while (iterator.hasNext()) {
			String element = iterator.next();			//하나의 객체를 가져온다.
			System.out.println("\t" + element);
		}

		set.clear();
		if (set.isEmpty()) {
			System.out.println("비어 있음");
		}
	}
}
