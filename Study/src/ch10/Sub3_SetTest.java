package ch10;

import java.util.HashSet;
import java.util.Iterator;

/**
 * 날짜 : 2022 01 11
 * 이름 : 박준혁
 * 내용 : 자바 컬렉션 집합(Set) 실습하기 교재 p357
 */
public class Sub3_SetTest {
	
	public static void main(String[] args) {
		
		//Set 생성
		HashSet<Integer> set = new HashSet<>();
		
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		set.add(5);
		set.add(1);
		set.add(3);
		
		System.out.println("set 원소 : "+set);
		System.out.println("set 크기 : "+set.size());
		
		//Set 출력
		for(int n : set) {
			System.out.println(n+" ");
		}
		System.out.println("\n");
		
		//반복자(Iterator)를 이용한 출력
		Iterator<Integer> iter = set.iterator();
		
		while(iter.hasNext()) { //다음데이터 없을때 까지 반복
			
			int num = iter.next();
			System.out.println(num + " ");
			
		}
		
		System.out.println("\n");
			
		
	}

}
