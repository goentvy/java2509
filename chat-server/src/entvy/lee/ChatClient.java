package entvy.lee;

import java.io.*;
import java.net.*;

public class ChatClient {
	public static void main(String[] args) throws IOException {
		Socket socket = new Socket("localhost", 12345);
		System.out.println("서버에 연결됨.");
		
		BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream(), "UTF-8"));
		PrintWriter out = new PrintWriter(new OutputStreamWriter(socket.getOutputStream(), "UTF-8"), true);
		
		BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
		
		String userInput;
		while (true) {
			System.out.print("클라이언트: ");
			userInput = console.readLine();
			out.println(userInput);
			
			String response = in.readLine();
			System.out.println("서버: " + response);
		}
	}
}
