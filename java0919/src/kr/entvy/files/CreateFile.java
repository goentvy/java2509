package kr.entvy.files;

import java.io.File;
import java.io.IOException;

public class CreateFile {

	public static void main(String[] args) {
		try {
			File myObj = new File("D:\\Entvy\\filename.txt");
			if(myObj.createNewFile()) {
				System.out.println("file created: " + myObj.getName());
				System.out.println("file absolute path: " + myObj.getAbsolutePath());
			} else {
				System.out.println("File already exists.");
			}
		} catch (IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
	}

}
