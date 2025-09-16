package java0910;

public class CarExample {
	public static void simulate() {
		Car myCar = new Car();
		
//		myCar.speed = 200;
		myCar.defaultRun();
	}

	public static void main(String[] args) {
		
		simulate();
		
		Car myCar = new Car();
		
//		myCar.speed = 60;
		myCar.defaultRun();
		
		Car myCar4 = new Car("그랜저");
		
		System.out.println(myCar4.company);
		System.out.println(myCar4.model);
		System.out.println(myCar4.color);
		System.out.println(myCar4.maxSpeed);
		System.out.println();
		
		Car myCar1 = new Car("그랜저", "검정");
		
		System.out.println(myCar1.company);
		System.out.println(myCar1.model);
		System.out.println(myCar1.color);
		System.out.println(myCar1.maxSpeed);
		System.out.println();
		
		Car myCar2 = new Car("그랜저", "파랑", 250);
		
		System.out.println(myCar2.company);
		System.out.println(myCar2.model);
		System.out.println(myCar2.color);
		System.out.println(myCar2.maxSpeed);
		
		Car myCar3 = new Car();
		
		myCar3.setGas(5);
		
		if(myCar3.isLeftGas()) {
			System.out.println("출발합니다.");
			
			myCar3.run();
		}
		System.out.println("gas를 주입하세요.");
	}

}
