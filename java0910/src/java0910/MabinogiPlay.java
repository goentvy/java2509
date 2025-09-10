package java0910;

public class MabinogiPlay {
	public static void main(String[] args) {
		Mabinogi ester = new Mabinogi();
		ester.login("에스테르");
		ester.play();
		ester.death();
		ester.hacking();
		ester.logout();
		ester.delete();
		ester.login("에스테르");
		ester.delete();
		
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		
		Mabinogi entvy = new Mabinogi();
		entvy.play();
		entvy.login("순진무구한마법사");
		entvy.play();
		entvy.hacking();
		entvy.logout();
		entvy.delete();
		entvy.login("순진무구한마법사");
		entvy.delete();
	}	
}
