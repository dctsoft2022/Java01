package j01_Basic;

// bit 연산자
// 비트단위로 피연산자를 논리연산한다.
public class Operator {

    public static void main(String[] args) {

        // 암호화에 사용된 비트 연산자
        int iPassword = 123456, iTemp = 0;
        int iEncodingAndDecoding = 0x1A234B67;

        System.out.println("암호화 전 : "+iPassword);

        iTemp = iPassword ^ iEncodingAndDecoding;
        System.out.println("암호화 후 : "+iTemp);

        iTemp = iTemp ^ iEncodingAndDecoding;
        System.out.println("복호화 후 : "+iTemp);

        // 1. 쉬프트 연산자
        int x = 10; // 1010
        int y = 6; // 0110

        System.out.println("x>>y = "+(x>>y)); // 오른쪽으로 y칸 이동
        System.out.println("x>>1 = "+(x>>1)); // 0101 -> 5
        System.out.println("y<<2 = "+(y<<2)); // 011000 -> 24

        // 2. 논리 연산자
        System.out.println("x&y = "+(x&y)); //AND 0010 -> 2
        System.out.println("x|y = "+(x|y)); //OR 1110 -> 14
        System.out.println("x^y = "+(x^y)); //XOR(같으면 0) 1100 -> 12
    }
}
