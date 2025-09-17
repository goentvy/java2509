package example;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {
		Set<String> sets = new HashSet<String>();
		// HashSet 컬렉션 생성
		Set<Member> set = new HashSet<Member>();
		
		// Member 객체 저장
		set.add(new Member("홍길동", 30));
		set.add(new Member("홍길동", 30)); // 인스턴스는 다르지만 동등 객체이므로 객체 1개만 저장
		
		// 저장된 객체 수 출력
		System.out.println("총 객체 수 : " + set.size());
		System.out.println("--------------------------");
		
		// sets 객체 추가
		sets.add("Java");
		sets.add("JDBC");
		sets.add("JSP");
		sets.add("Spring");
		
		// 객체를 하나씩 가져와서 처리
		Iterator<String> iterator = sets.iterator();
		while(iterator.hasNext()) {
			// 객체를 하나 가져오기
			String element = iterator.next();
			System.out.println(element);
			if(element.equals("JSP")) {
				// 가져온 객체를 컬렉션에서 제거
				iterator.remove();
			}
			System.out.println(sets);
		}
		System.out.println();
		
		// 객체 제거
		sets.remove("JDBC");
		
		// 객체를 하나씩 가져와서 처리
		for(String element : sets) {
			System.out.println(element);
		}
	}
}
