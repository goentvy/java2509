package kr.entvy.files;

import java.io.File;

public class DeleteFolder {

	public static void main(String[] args) {
		File myObj = new File("D:\\Entvy\\Test");
		if(myObj.delete()) {
			System.out.println("Deleted the folder: " + myObj.getName());
		} else {
			System.out.println("Failed to delete the folder");
		}
	}
}
