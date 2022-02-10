package j07_AbstractInterface;
// 인터페이스 : 상수와 추상메서드만 정의 가능
// 직접 인스턴스 생성 불가능, 후손으로 가능
interface NumberInter{
    //static final int NUM = 100; 생략가능
    int NUM = 100;
    //public abstract int getNum(); 생략가능
    int getNum();
}//NumberInter

class NumChild1 implements NumberInter{
    // 오버라이딩 : 반드시 조상의 접근 범위보다 같거나 넓어야한다.
    @Override
    public int getNum() {
        return NUM*2;
    }
}//NumChild1

class NumChild2 implements NumberInter{
    @Override
    public int getNum() {
        return NUM*NUM;
    }
}//NumChild2

public class AI02_Interface01 {
    public static void main(String[] args) {
        NumChild1 nc1 = new NumChild1();
        NumChild2 nc2 = new NumChild2();
        System.out.println("nc1.getNum = "+nc1.getNum());
        System.out.println("nc2.getNum = "+nc2.getNum());

        //다형성 적용 가능
        NumberInter ni = new NumChild1();
        System.out.println("ni.getNum = "+ni.getNum());
    }//main
}
