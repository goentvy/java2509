package com.lee.mapex;

import java.util.Map;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class MapExam {
	public MapExam() {
		
		// HashMap - 키-값 쌍, 순서 보장 안됨
		Map<String, Integer> hashMap = new HashMap<>();
		hashMap.put("사과", 1000);
		hashMap.put("바나나", 500);
		hashMap.put("오렌지", 800);
		hashMap.put("사과", 1200); // 기존 값 덮어쓰기
		
		System.out.println("HashMap: " + hashMap);
		System.out.println("사과 가격: " + hashMap.get("사과"));
		System.out.println("----------------");
		
		System.out.println("키: ");
		for(String key : hashMap.keySet()) {
			System.out.println(key + " ");
		}
		System.out.println();
		
		System.out.println("값: ");
		for(Integer value: hashMap.values()) {
			System.out.println(value + " ");
		}
		System.out.println();
		System.out.println("----------------");
		
		// TreeMap - 키 기준 자동 정렬
		Map<String, String> treeMap = new TreeMap<>();
		treeMap.put("서울", "Seoul");
		treeMap.put("부산", "Busan");
		treeMap.put("대구", "Daegu");
		treeMap.put("인천", "Incheon");
		
		System.out.println("TreeMap (키 정렬): " + treeMap);
		System.out.println("----------------");
		
		// LinkedHashMap - 입력 순서 유지
		Map<Integer, String> linkedHashMap = new LinkedHashMap<>();
		linkedHashMap.put(3, "셋");
		linkedHashMap.put(1, "하나");
		linkedHashMap.put(2, "둘");
		
		System.out.println("LinkedHashMap (순서 유지): " + linkedHashMap);
		System.out.println("----------------");
	}
}
