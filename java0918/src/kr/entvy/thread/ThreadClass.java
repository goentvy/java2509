package kr.entvy.thread;

public class ThreadClass extends Thread {
	public static int amount = 0;
	
	public static void main(String[] args) {
		ThreadClass thread = new ThreadClass();
		thread.start();
		while(thread.isAlive()) {
			System.out.println("Waiting...");
		}
		System.out.println("ThreadClass: " + amount);
		amount++;
		System.out.println("ThreadClass: " + amount);
	}
	public void run() {
		amount++;
	}
}
