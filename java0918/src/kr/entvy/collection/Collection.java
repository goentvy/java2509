package kr.entvy.collection;

import java.util.ArrayList;
import java.util.List;

public class Collection {
	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
		names.add("주환");
		names.add("근철");
		
		for(String name : names) {
			System.out.println(name);
		}
	}

}
