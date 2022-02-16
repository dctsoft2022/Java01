package j08_CastingEncap;

// 클래스 형변환
//=> 자동 형변환 (형변환 생략가능)
//   조상 <- 자손 (Up_Casting)

//=> 명시적 형변환 (형변환 생략불가능)
//   조상 -> 자손 (Down_casting)
import org.omg.CORBA.Object;

class Animal{
    int legsAll = 2;
    String name;
    public Animal(){System.out.println("Animal 생성자");}
    public Animal(String name){this.name = name;}
    void breath(){System.out.println(name+"은/는 숨을 쉰다.");}
}//Animal

class Mammal extends Animal{
    String cry;
    int legs = 4;
    public Mammal(){System.out.println("Mammal 생성자");}
    void crying(){System.out.println(super.name+"은/는 "+cry+"운다.");}
}//Mammal

class PetAnimal extends Mammal{
    int legs = 6;
    PetAnimal(){System.out.println("PetAnimal 생성자");}
    void legPrint(int legs){
        System.out.printf("%s의 다리 => (Local):%d, Pet(Global):%d, Mam(Father):%d, Ani(할아버지):%d \n"
                ,name,legs,this.legs,super.legs, super.legsAll) ;
    }
}//PetAnimal

public class CE01_ClassCasting {
    public static void main(String[] args) {
        PetAnimal cat = new PetAnimal();
        PetAnimal dog = new PetAnimal();
        if (cat instanceof PetAnimal) System.out.println("cat은 PetAnimal 입니다.");
        if (cat instanceof Mammal) System.out.println("cat은 Mammal 입니다.");
        if (cat instanceof Animal) System.out.println("cat은 Animal 입니다.");
        if (cat instanceof Object) System.out.println("cat은 Object 입니다.");

        Animal an1 = new PetAnimal(); //Up-Casting 가능
        //PetAnimal pa1 = new Animal(); //Down_Casting 불가능
        Animal an2 = new Animal();

        //an2 = cat; //Up_Casting 가능
        dog = (PetAnimal) an1; //컴파일오류,런타임오류 발생 안함
        //dog = (PetAnimal) an2; //Down_Casting => 명시적으로
        // ↑ 런타임 오류 발생 (an2 = dog; 가 없다면 발생)
        dog.legPrint(10);

        //** Class Type 출력하기
        System.out.println("-dog ClassType => "+ dog.getClass().getName());
        System.out.println("--an1 ClassType => "+ an1.getClass().getName());
        System.out.println("---an2 ClassType => "+ an2.getClass().getName());
    }
}
