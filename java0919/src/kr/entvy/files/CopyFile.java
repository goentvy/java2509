package kr.entvy.files;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {

	public static void main(String[] args) {
		try (FileInputStream input = new FileInputStream("D:\\Entvy\\gallery\\images\\image_1.jpg");
				FileOutputStream output = new FileOutputStream("D:\\Entvy\\gallery\\images\\copy.jpg")) {
			int i;
			while((i = input.read()) != -1) {
				output.write(i);
			}
			
			System.out.println("File copied successfully.");
		} catch (IOException e) {
			System.out.println("Error handling file.");
		}
	}

}
