package kr.test;

public class Document implements Printable {
	String content;
	
	public Document(String content) {
		this.content = content;
	}
	
	@Override
	public void print() {
		System.out.println("문서 내용: " + content);
	}
}
