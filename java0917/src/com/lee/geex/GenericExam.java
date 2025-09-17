package com.lee.geex;

class Box {
	private Object item;
	
	public Object getItem() {
		return item;
	}
	
	public void setItem(Object item) {
		this.item = item;
	}
}

class GenericBox<T> {
	private T item;
	
	public T getItem() {
		return item;
	}
	
	public void setItem(T item) {
		this.item = item;
	}
}

public class GenericExam {

	public GenericExam() {
		Box box = new Box();
		box.setItem("Hello"); // 문자열 저장
		
		// 형변환 필요 (컨타임 오류 가능성 있음)
		String str = (String) box.getItem();
		System.out.println(str);
		
		// 제네릭 적용
		GenericBox<String> gBox = new GenericBox<>();
		gBox.setItem("GenericBox");
		
		// 형변환 불필요 (런타임 오류 가능성 X)
		String str2 = gBox.getItem();
		System.out.println(str2);
	}

}
