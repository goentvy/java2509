package kr.entvy.trycatch;

public class TryMain {
	public TryMain() {
		
//		ArrayIndexOutOfBoundsException
		try {
			int[] myNums = { 1, 2, 3 };
			System.out.println(myNums[10]);
		} catch (Exception e) {
			// ArrayIndexOutOfBoundsException Error에 대한 처리
			if(e instanceof ArrayIndexOutOfBoundsException) {
				e.printStackTrace();
				e.getMessage();
			} else { // 그외 Error에 대한 처리
				e.printStackTrace();
				e.getMessage();
			}
		} finally {
			checkAge(15);
		}
	}
	
	private void checkAge(int age) {
		if(age < 18) {
			throw new ArithmeticException("만 18세 미만은 투표권이 없습니다.");
		} else {
			System.out.println("소중한 투표 감사합니다.");
		}
	}
}
