package j08_CastingEncap;

import j06_ClassExtends.CE03_Father;

//** package & import Test
// 접근범위
// default : package 내에서만 사용 가능
// private : class 내에서만 사용 가능
// public : project 전체에서 사용 가능
// protected : default + 상속

public class CE03_PackageTest {
    public static void main(String[] args) {
        Animal am = new Animal();
        am.breath();

        CE03_Father father = new CE03_Father();
        //다른 패키지 import 필요
        father.info();

    }
}
