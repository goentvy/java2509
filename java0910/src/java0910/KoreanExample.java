package java0910;

public class KoreanExample {
	public static void main(String[] args) {
		Korean k1 = new Korean("이주환", "010101-020202");
		
		System.out.println("k1.nation : " + k1.nation);
		System.out.println("k1.name : " + k1.name);
		System.out.println("k1.ssn : " + k1.ssn);
		System.out.println();
		
		Korean k2 = new Korean("박근철", "020202-030303");
		System.out.println("k1.nation : " + k2.nation);
		System.out.println("k1.name : " + k2.name);
		System.out.println("k1.ssn : " + k2.ssn);
	}
}
