package com.lee.setex;

import java.util.Set;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetExam {
	public SetExam() {
		
		// HashSet - 중복 제거, 순서 보장 안됨
		Set<String> hashSet = new HashSet<>();
		hashSet.add("Java");
		hashSet.add("Python");
		hashSet.add("JavaScript");
		hashSet.add("Java"); // 중복 - 추가되지 않음
		System.out.println("HashSet (순서 보장X): " + hashSet);
		System.out.println("----------");
		
		// TreeSet - 중복 제거, 자동 정렬
		Set<Integer> treeSet = new TreeSet<>();
		treeSet.add(30);
		treeSet.add(10);
		treeSet.add(50);
		treeSet.add(20);
		treeSet.add(10); // 중복 - 추가되지 않음
		
		System.out.println("TreeSet (정렬됨): " + treeSet);
		System.out.println("----------");
		
		// LinkedHashSet - 중복 제거, 입력 순서 유지
		Set<String> linkedHashSet = new LinkedHashSet<>();
		
		linkedHashSet.add("첫째");
		linkedHashSet.add("둘째");
		linkedHashSet.add("셋째");
		linkedHashSet.add("첫째"); // 중복 - 추가되지 않음
		
		System.out.println("LinkedHashSet (순서 유지): " + linkedHashSet);
		System.out.println("----------");
	}
}
