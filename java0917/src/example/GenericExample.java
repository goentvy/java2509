package example;

class Box<T> {
	T content;
	private T t;
	
	public T get() {
		return t;
	}
	
	public void set(T t) {
		this.t = t;
	}
	
	// Box의 내용물이 같은지 비교
	public boolean compare(Box<T> other) {
		boolean result = content.equals(other.content);
		return result;
	}
}

class Product<K, M> {
	private K kind;
	private M model;
	
	public K getKind() { return this.kind; }
	public M getModel() { return this.model; }
	public void setKind(K kind) { this.kind = kind; }
	public void setModel(M model) { this.model = model; }
}

class Tv {
	
}

class Car {
	public void run() {
		System.out.println("자동차가 달립니다.");
	}
}

class Home {
	public void turnOnLight() {
		System.out.println("전등을 켭니다.");
	}
}

class HomeAgency implements Rentable<Home> {
	@Override
	public Home rent() {
		return new Home();
	}
}

class CarAgency implements Rentable<Car> {
	@Override
	public Car rent() {
		return new Car();
	}
}

public class GenericExample {
	// 제네릭 메소드
	public static <T> Box<T> boxing(T t) {
		Box<T> box = new Box<T>();
		box.set(t);
		return box;
	}
	
	public static <T extends Number> boolean compare(T t1, T t2) {
		System.out.println("compare(" + t1.getClass().getSimpleName() + ", " + t2.getClass().getSimpleName() + ")");
		
		// Number의 메소드
		double v1 = t1.doubleValue();
		double v2 = t2.doubleValue();
		
		return (v1 == v2);
	}

	public static void main(String[] args) {
//		Box<String> box = new Box<>();
//		box.content = "하이하이";
//		String str = box.content;
//		System.out.println(str);
//		
//		Box<Integer> box2 = new Box<>();
//		box2.content = 100;
//		int value = box2.content;
//		System.out.println(value);
		
		// K는 Tv로 대체, M은 String으로 대체
//		Product<Tv, String> product1 = new Product<>();
//		
//		// Setter 매개값은 반드시 Tv와 String을 제공
//		product1.setKind(new Tv());
//		product1.setModel("스마트 Tv");
//		
//		// Getter 리턴값은 Tv와 String이 됨
//		Tv tv = product1.getKind();
//		String tvModel = product1.getModel();
//		
//		// K는 Car로 대체, M은 String으로 대체
//		Product<Car, String> product2 = new Product<>();
//		
//		product2.setKind(new Car());
//		product2.setModel("SUV자동차");
//		
//		Car car = product2.getKind();
//		String carModel = product2.getModel();
		
//		HomeAgency homeAgency = new HomeAgency();
//		Home home = homeAgency.rent();
//		home.turnOnLight();
//		
//		CarAgency carAgency = new CarAgency();
//		Car car = carAgency.rent();
//		car.run();
		
//		Box<String> box1 = new Box<>();
//		box1.content = "100";
//		
//		Box<String> box2 = new Box<>();
//		box2.content = "100";
//		
//		boolean result1 = box1.compare(box2);
//		System.out.println("box1 == box2 : " + result1);
		
		// 제네릭 메소드 호출
//		Box<Integer> box1 = boxing(100);
//		int intValue = box1.get();
//		System.out.println(intValue);
//		
//		// 제네릭 메소드 호출
//		Box<String> box2 = boxing("이주환");
//		String strValue = box2.get();
//		System.out.println(strValue);
		
		boolean result1 = compare(10, 20);
		System.out.println(result1);
		System.out.println();
		
		boolean result2 = compare(4.5, 4.5);
		System.out.println(result2);
	}

}
