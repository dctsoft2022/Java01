package j07_AbstractInterface;
//** static, default 에서드

interface NewInter{
    void test(); //일반적 추상메서드 : 오버라이딩 의무

    //반드시 인터페이스 내에서 구현해야함
    static void staticTest() {
        System.out.println("Interface staticTest()*");
    }

    //반드시 인터페이스 내에서 구현해야함
    default void defaultTest() {
        System.out.println("Interface defaultTest()");
    }
}//NewInter

class NewTest implements NewInter{
    @Override
    public void test() {System.out.println("class Test 메서드");}
    //조상 인터페이스와 동일한 static 메서드 작성
    static void staticTest() {System.out.println("class staticTest 메서드");}
    //일반 클래스에서는 허용 안됨
    //default void defaultTest() {System.out.println("--defaultTest 메서드--");}
    //=> default 메서드는 오버라이딩 금지
    // void defaultTest(){}
}

public class AI04_Interface02 {
    public static void main(String[] args) {
        //1. class 인스턴스 생성
        NewTest nt1 = new NewTest();
        nt1.defaultTest();
        nt1.test();
        // static 메서드는 클래스 또는 인터페이스 종속
        //=> 상속 되지 않음
        //=> 인터페이스의 static 메서드는 인터페이스명으로만 접근 가능
        NewTest.staticTest();
        NewInter.staticTest();

        //2. 인터페이스를 이용한 생성
        //=> 인터페이스에 정의된 만큼만 접근 가능
        NewInter nt2 = new NewTest();
        nt2.defaultTest();
        nt2.test();
    }
}
