package java0910;

public class Mabinogi {
	String id;
	boolean log = false;
	
	void login(String id) {
		this.id = id;
		this.log = true;
		System.out.println(this.id + "가 마비노기 세상에 접속했습니다.");
	}
	
	void logout() {
		System.out.println(this.id + "가 세상을 떠났습니다.");
		this.log = false;
	}
	
	void play() {
		if(this.log) {
			System.out.println(this.id + " 캐릭터가 게임을 진행합니다.");
		} else {
			System.out.println("로그인을 진행해주세요.");
		}
	}
	
	void death() {
		if(this.log) {
			System.out.println(this.id + " 캐릭터가 사망하였습니다.");
		} else {
			System.out.println("로그인을 진행해주세요.");
		}
	}
	
	void hacking() {
		if(this.log) {
			System.out.println(this.id + " 계정의 전재산이 해킹범에게 털렸습니다. 복구는 불가능합니다.");
		} else {
			System.out.println("계정이 해킹에 취약합니다. 로그인 진행해주세요.");
		}
	}
	
	void delete() {
		if(this.log) {
			System.out.println(this.id + " 주인이 씨발을 외치며 계정을 삭제했습니다.");
		} else {
			System.out.println("로그인 안하면 계정삭제 승인 안해줄건데?");
		}
	}
}
