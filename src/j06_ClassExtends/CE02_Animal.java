package j06_ClassExtends;

class Animal{
    int legs;
    String name;
    Animal(){System.out.println("Animal 생성자"); }
    void breath() {
        System.out.println(name +" 는 숨을 쉰다.");
    }
}//Animal
class Mammal extends Animal{
    String cry;
    int legs;
    Mammal(){System.out.println("Mammal 생성자"); }
    void crying() {
        System.out.println(super.name+"는 "+cry+" 웁니다." );
    }
}//Mammal
class Wild extends Mammal{
    String place;
    Wild(){System.out.println("Wild 생성자"); }
    void living() {
        System.out.println(super.name+"는 "+place+"에 살고 있습니다." );
    }
}//Wild
class Pet extends Mammal{
    String vaccine;
    Pet(){System.out.println("Pet 생성자"); }
    void treating() {
        System.out.println(super.name+"는 "+vaccine+"을 완료 하였습니다." );
    }
}//Pet
public class CE02_Animal {
    public static void main(String[] args) {
        Wild wd = new Wild(); // 조상클래스의 생성자를 모두 순차적으로 실행
        wd.name = "사자";
        wd.cry = "어흥";
        wd.place = "동물원";
        wd.breath();
        wd.crying();
        wd.living();

        Pet pt = new Pet();
        pt.name = "고양이";
        pt.cry = "야용";
        pt.vaccine = "예방접종";
        pt.breath();
        pt.crying();
        pt.treating();
    }
}
