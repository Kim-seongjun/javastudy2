package hashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample1 {
	public static void main(String[] args) {
		// Map 컬렉션 생성
		Map<String, Integer> map = new HashMap<String, Integer>();

		// 객체 저장
		map.put("이름1", 85);
		map.put("이름2", 90);
		map.put("이름3", 80);
		map.put("이름2", 95); // 이름2 라는 '키'가 같기 때문에 제일 마지막에 저장한 값으로 대치
		System.out.println("총 Entry 수: " + map.size());

		// 객체 찾기
		System.out.println("이름1 : " + map.get("이름1"));
		System.out.println();

		// 객체를 하나씩 처리
		Set<String> keySet = map.keySet(); // keySet얻기
		Iterator<String> keyIterator = keySet.iterator(); //반복자 얻기
		while (keyIterator.hasNext()) {		//keyIterator.hasNext() : keyIterator에서 가져올 객체가 있으면  true
			String key = keyIterator.next();	//반복해서 '키'를 얻고
			Integer value = map.get(key);		//얻은 '키'를 이용해 값을 얻어냄
			System.out.println(key + " : " + value);
		}
		System.out.println();

		//객체 삭제
		map.remove("이름2");
		System.out.println("총 Entry 수: " + map.size());


		// 객체 전체 삭제
		map.clear();		//모든 Map.Entry 삭제
		System.out.println("총 Entry 수: " + map.size());
	}
}
