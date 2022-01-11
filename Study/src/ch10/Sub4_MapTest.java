package ch10;

import java.util.HashMap;
import java.util.Map;

/**
 * ��¥ : 2022 01 11
 * �̸� : ������
 * ���� : �ڹ� �÷��� ��(Map) �ǽ��ϱ� ���� p372 (Key-Value)
 */
public class Sub4_MapTest {
	
	public static void main(String[] args) {
		
		//Map ����
		Map<String, String> map1 = new HashMap<>();
		
		map1.put("A", "Apple");
		map1.put("B", "Banana");
		map1.put("C", "Cherry");
		
		System.out.println("map1 : "+map1);
		
		//Map ũ��
		System.out.println("map1 ũ�� : "+map1.size());
		
		//Map ���
		System.out.println("map1 ŰA : "+map1.get("A"));
		System.out.println("map1 ŰB : "+map1.get("B"));
		System.out.println("map1 ŰC : "+map1.get("C"));
		
		
	}

}
