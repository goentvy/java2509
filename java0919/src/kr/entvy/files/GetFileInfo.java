package kr.entvy.files;

import java.io.File;

public class GetFileInfo {

	public static void main(String[] args) {
		File myObj = new File("D:\\Entvy\\filename.txt");
		if(myObj.exists()) {
			System.out.println("File name: " + myObj.getName());
			System.out.println("Absolute path: " + myObj.getAbsolutePath());
			System.out.println("Writeable: " + myObj.canWrite());
			System.out.println("Readable: " + myObj.canRead());
			System.out.println("File size in bytes " + myObj.length());
		} else {
			System.out.println("The file does not exist");
		}
		
		// 파일을 읽는 다른 방법
		// Scanner - 간단한 텍스트나 숫자나 단어를 쉽게 분석하고 싶을때 사용
		// BufferedReader - 대용량 텍스트 파일에 가장 적합, 속도가 빠르고 줄 단위로 읽을수 있음.
		// FileInputStream - 바이너리 데이터 (이미지, 오디오, PDF)에 가장 적합, 원시 바이트를 완벽하게 제어할때 사용
	}

}
