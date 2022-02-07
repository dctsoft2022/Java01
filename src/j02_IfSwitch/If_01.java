package j02_IfSwitch;

import java.util.Random;

public class If_01 {
    public static void main(String[] args) {

        // 삼항식
        int a = 100, b = 50;
        int c = (a>b)?a:b;
        System.out.println("c = "+c);

        // 두개의 정수 x, y가 있다.
        // x가 y보다 크고
        //      둘다 짝수이면 1등 당첨, x값을 두배로 늘려줌
        //      둘다 짝수가 아니면 2등 당첨, x값을 1.5배로 늘려줌
        // 크지 않으면서
        //      y가 홀수이면 3등 당첨, y값을 1.5배 늘려줌
        //      y가 홀수가 아니면 4등 당첨
        double x, y;
        Random rn = new Random();
        x = rn.nextInt(50)+1;
        y = rn.nextInt(50)+1;
        if (x>y){
            if (x%2==0&&y%2==0){
                System.out.println("1등 당첨 x: "+(x*2));
            }else{
                System.out.println("2등 당첨 x: "+(x*1.5));
            }
        }else{
            if (y%2==1){
                System.out.println("3등 당첨 y: "+(y*1.5));
            }else{
                System.out.println("4등 당첨");
            }
        }
        System.out.println("x: "+x+", y: "+y);
    }
}
