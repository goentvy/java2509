package kr.entvy.files;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamExample {

	public static void main(String[] args) {
		String text = "Hello World!";
		
		try (FileOutputStream output = new FileOutputStream("D:\\Entvy\\filename.txt")) {
			output.write(text.getBytes());
			System.out.println("Successfully write to file.");
		} catch (IOException e) {
			System.out.println("Error wrting file.");
			e.printStackTrace();
		}
	}

}
