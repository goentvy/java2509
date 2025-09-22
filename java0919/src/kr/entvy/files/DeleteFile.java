package kr.entvy.files;

import java.io.File;

public class DeleteFile {

	public static void main(String[] args) {
		File myObj = new File("D:\\Entvy\\filename1.txt");
		if(myObj.delete()) {
			System.out.println("Delete the file: " + myObj.getName());
		} else {
			System.out.println("Failed to delete the file.");
		}
	}
}
