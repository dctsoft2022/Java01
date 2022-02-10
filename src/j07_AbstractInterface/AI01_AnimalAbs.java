package j07_AbstractInterface;
// 추상클래스
// 추상메서드가 하나라도 정의되면 그 클래스는 반드시 추상클래스로 정의 해야한다.
// 직접 인스턴스를 생성하지 못함. 후손으로 가능
// 인터페이스와의 차이는 일반메서드 생성가능
abstract class Animal{
    String kind;
    // 일반 메서드
    void breathe(){System.out.println(kind+"는 숨쉰다.");}

    // 추상 메서드
    abstract void sound();
    abstract void special();
}

class Cat extends Animal{
    Cat(){kind = "고양이";}
    @Override
    void sound() {System.out.println("야옹 야옹");}
    @Override
    void special() {System.out.println("날렵한 고양이");}
}

class Dog extends Animal{
    Dog(){kind = "강아지";}
    @Override
    void sound() {System.out.println("멍멍 멍멍");}
    @Override
    void special() {System.out.println("꼬리흔들기");}
    void color(){System.out.println("흰색");}
}

public class AI01_AnimalAbs {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.breathe();
        cat.sound();
        cat.special();

        Dog dog = new Dog();
        dog.breathe();
        dog.sound();
        dog.special();
        dog.color(); // 추상메서드 아닌것도 가능

        // 추상클래스 적용 & 다형성
        System.out.println("-----추상클래스 적용 & 다형성-----");
        Animal aniCat = new Cat();
        aniCat.breathe();
        aniCat.sound();
        aniCat.special();

        Animal aniDog = new Dog();
        aniDog.breathe();
        aniDog.sound();
        aniDog.special();
        //aniDog.color(); 추상메서드 아니여서 불가능

        System.out.println("-----메서드 오버로딩-----");
        animalUse(aniCat);
        animalUse(cat);
        if (dog instanceof Animal) animalUse(dog);
        else System.out.println("Animal 인스턴스를 생성할 수 없다.");
        System.out.println("-----Object Test-----");
        objectTest(dog);
    }//main

    // 메서드 오버로딩
    public static void animalUse(Animal ani){
        ani.breathe();
        ani.sound();
        ani.special();
    }
    public static void objectTest(Object obj){
        System.out.println("objectTest = "+obj);
    }
}
