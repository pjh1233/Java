package ch10;

import java.util.HashMap;
import java.util.Map;

/**
 * 날짜 : 2022 01 11
 * 이름 : 박준혁
 * 내용 : 자바 컬렉션 맵(Map) 실습하기 교재 p372 (Key-Value)
 */
public class Sub4_MapTest {
	
	public static void main(String[] args) {
		
		//Map 생성
		Map<String, String> map1 = new HashMap<>();
		
		map1.put("A", "Apple");
		map1.put("B", "Banana");
		map1.put("C", "Cherry");
		
		System.out.println("map1 : "+map1);
		
		//Map 크기
		System.out.println("map1 크기 : "+map1.size());
		
		//Map 출력
		System.out.println("map1 키A : "+map1.get("A"));
		System.out.println("map1 키B : "+map1.get("B"));
		System.out.println("map1 키C : "+map1.get("C"));
		
		
	}

}
