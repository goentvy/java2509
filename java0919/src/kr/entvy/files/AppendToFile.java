package kr.entvy.files;

import java.io.FileWriter;
import java.io.IOException;

public class AppendToFile {

	public static void main(String[] args) {
		try (FileWriter myWriter = new FileWriter("D:\\Entvy\\filename.txt", true)) {
			myWriter.write("\nAppended text!");
			System.out.println("Successfully appended to the file.");
		} catch (IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
	}

}
