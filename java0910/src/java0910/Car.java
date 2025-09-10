package java0910;

public class Car {
	// field
	public String company = "현대자동차";
	public String model;
	public String color;
	public int maxSpeed;
	public int gas;
	private double speed;
	private boolean stop;
	
	// getter & setter
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}
	
	public double getSpeed() {
		double km = speed*1.6;
		return km;
	}

	public void setSpeed(double speed) {
		if(speed < 0) {
			this.speed = 0;
			return;
		} else {
			this.speed = speed;
		}
	}
	
	public boolean isStop() {
		return stop;
	}
	
	public void setStop(boolean stop) {
		this.stop = stop;
		if(stop == true) this.speed = 0;
	}
	
	// 생성자
	public Car() {
		
	}
	public Car(String model) {
		this(model, "은색", 150);
	}
	public Car(String model, String color) {
		this(model, color, 250);
	}
	public Car(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	
	
	public void setGas(int gas) {
		this.gas = gas;
	}
	public boolean isLeftGas() {
		if(gas == 0) {
			System.out.println("gas가 없습니다.");
			return false;
		}
		System.out.println("gas가 있습니다.");
		return true;
	}
	public void run() {
		while (true) {
			if(gas > 0) {
				System.out.println("달립니다.(gas잔량:" + gas + ")");
				gas -= 1;
			} else {
				System.out.println("멈춥니다.(gas잔량:" + gas + ")");
				return;
			}
		}
	}
	public void defaultRun() {
		System.out.println(speed + "km로 달립니다.");
	}
}
