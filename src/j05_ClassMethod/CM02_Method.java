package j05_ClassMethod;

public class CM02_Method {
    int price = 15000; // 전역변수

    public void Machine1(){
        System.out.println("주문해 주세요.");
    }
    public void Machine2(String s){
        if (s.contains("unclear")){
            System.out.println("재료가 불량입니다.");
            return; //매서드 종료
        }
        System.out.println(s+"쥬스가 만들어졌습니다.");
    }
    public int Machine3(){
        return price*3;
    }
    public int Machine4(String s, int i){
        System.out.println(s+"쥬스 "+i+"잔을 만들었습니다.");
        return price*i;
    }

    public static void main(String[] args) {
        CM02_Method m01 = new CM02_Method();
        m01.Machine1();
        m01.Machine2("orange unclear");
        m01.Machine2("apple");
        System.out.println("m01.Machine3 = "+m01.Machine3());
        System.out.println("m01.Machine4 = "+m01.Machine4("tomato",5));
    }
}
