package j05_ClassMethod;

public class CM06_StaticTest {
    public static void main(String[] args) {
        // Static 멤버
        CM06_Static.total = 300;
        System.out.println("mul(20,4) = "+CM06_Static.mul(20,4)); //80
        System.out.println("div(20,4) = "+CM06_Static.div(20,4)); //5
        System.out.println("total 1 = "+CM06_Static.total); //385

        // 인스턴스 멤버 1
        CM06_Static cm06 = new CM06_Static();
        cm06.result = 1000;
        System.out.println("adder(40,3) = "+cm06.adder(40,3)); //43
        System.out.println("min(40,3) = "+cm06.min(40,3)); //37
        System.out.println("total 2 = "+CM06_Static.total); //465
        System.out.println("result = "+cm06.result); //37

        // 인스턴스 멤버 2
        CM06_Static cm06N = new CM06_Static();
        cm06N.result = 3000;
        System.out.println("adder(40,3) = "+cm06N.adder(40,3)); //43
        System.out.println("min(40,3) = "+cm06N.min(40,3)); //37
        System.out.println("total 2 = "+CM06_Static.total); //545
        System.out.println("result = "+cm06N.result); //37
    }
}
