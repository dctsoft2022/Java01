package j01_Basic;

// ** Type Casting
public class CastingEx {
    public static void main(String[] args) {

        // 1. 프로모션
        double d = 123.45;
        int i = 78;
        d = i;
        System.out.println("d = "+d);
        System.out.println("i = "+i);

        // 2. 디모션
        char c = 'B';
        i = c + 2;
        System.out.println("int i = "+i);
        c = (char) i;
        System.out.println("char i = "+c);

        // 3. 오버플로우/언더플로우
        short sMin = Short.MIN_VALUE;
        short sMax = Short.MAX_VALUE;
        System.out.println("sMin = "+sMin+", sMax = "+sMax);
        System.out.println("(short)sMin-1 = "+(short)(sMin-1));
        System.out.println("sMin-1 = "+(sMin-1)); // int로 연산됨
        System.out.println("(short)sMax+1 = "+(short)(sMax+1));
    }
}
