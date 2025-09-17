package com.lee.listex;

import java.util.List;
import java.util.ArrayList;

public class ListExam {
	public ListExam() {
		List<String> arrList = new ArrayList<String>();
		arrList.add("사과");
		arrList.add("바나나");
		arrList.add("키위");
		arrList.add("메론");
		
		System.out.println(arrList);
		System.out.println(arrList.get(0));
		System.out.println(arrList.get(1));
		System.out.println(arrList.get(2));
		System.out.println("-------------");
		
		arrList.add(1, "포도");
		System.out.println(arrList);
		arrList.set(0, "링고");
		System.out.println(arrList);
		System.out.println("-------------");
		
		for(int i = 0; i < arrList.size(); i++) {
//			arrList.clear();
			if(arrList.isEmpty()) {
				arrList.add("사과");
			}
			if(arrList.get(i).contains("메론")) {
				arrList.set(i, "멜론");
			}
			System.out.println(arrList);
		}
		System.out.println("-------------");
		
		List<Integer> arrList2 = new ArrayList<>();
		arrList2.add(10);
		arrList2.add(20);
		arrList2.add(30);
		System.out.println(arrList2);
		System.out.println(arrList2.get(0));
		System.out.println(arrList2.get(1));
		System.out.println(arrList2.get(2));
	}
}
