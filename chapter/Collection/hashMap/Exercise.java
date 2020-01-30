package hashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Exercise {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Map<String, String> map = new HashMap<String, String>();

		map.put("양기두", "인재양성팀");
		map.put("황인철", "인재관리팀");
		map.put("임훈", "원장");
		map.put("김이준", "행정기획팀");

		System.out.print("이름을 입력하세요 : ");
		String name = scan.next();
		if(map.containsKey(name)) {
			System.out.println("부서 : "+map.get(name));
		} else {
			System.out.println("없는 이름입니다.");
		}
		
		Set<String> keySet = map.keySet();
		Iterator<String> keyIterator = keySet.iterator();
		while (keyIterator.hasNext()) {
			String key = keyIterator.next();
			String value = map.get(key);
			System.out.println(key + " : " + value);
		}
	}
}
