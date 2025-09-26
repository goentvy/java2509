package entvy.lee;

import java.io.*;
import java.net.*;

public class ChatServer {
	public static void main(String[] args) throws IOException {
		ServerSocket serverSocket = new ServerSocket(12345);
		System.out.println("서버 시작됨. 클라이언트 연결 대기중...");
		
		Socket clientSocket = serverSocket.accept();
		System.out.println("클라이언트 연결됨.");
		
		BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream(), "UTF-8"));
		PrintWriter out = new PrintWriter(new OutputStreamWriter(clientSocket.getOutputStream(), "UTF-8"), true);
		
		BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
		
		String inputLine;
		while ((inputLine = in.readLine()) != null) {
			System.out.println("클라이언트: " + inputLine);
			System.out.print("서버: ");
			String response = console.readLine();
			out.println(response);
		}
		
		clientSocket.close();
		serverSocket.close();
	}
}
