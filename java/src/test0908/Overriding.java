package test0908;

// 부모클래스
class Animal {
    public void sound() {
        System.out.println("동물이 소리를 냅니다.");
    }
}

// 자식 클래스: Dog (Animal을 상속받음)
class Dog extends Animal {
    @Override // 오버라이딩을 명시하는 어노테이션 (선택 사항이지만 권장)
    public void sound() {
        System.out.println("멍멍!"); // 부모 클래스의 sound() 메서드를 재정의
    }
}

// 자식 클래스: Cat (Animal을 상속받음)
class Cat extends Animal {
    @Override
    public void sound() {
        System.out.println("야옹~"); // 부모 클래스의 sound() 메서드를 재정의
    }
}

public class Overriding {
    public static void main(String[] args) {
        Animal genericAnimal = new Animal();
        Dog happyDog = new Dog();
        Cat cuteCat = new Cat();

        genericAnimal.sound(); // "동물이 소리를 냅니다." 출력
        happyDog.sound(); // "멍멍!" 출력 (Dog 클래스에서 재정의된 메서드 호출)
        cuteCat.sound();  // "야옹~" 출력 (Cat 클래스에서 재정의된 메서드 호출)

        // 다형성을 활용한 예시
        Animal myPet = new Dog(); // 부모 타입으로 자식 객체를 참조
        myPet.sound(); // "멍멍!" 출력 (런타임에 Dog의 sound() 호출)

        myPet = new Cat(); // 다른 자식 객체로 변경
        myPet.sound(); // "야옹~" 출력 (런타임에 Cat의 sound() 호출)
    }
}


