package j01_Basic;

// 2진수, 8진수, 16진수 표기
// => 2진수 : 0b 로 시작
// => 8진수 : 0 으로 시작
// => 16진수 : 0x 로 시작
public class OctHexEx {

    public static void main(String[] args) {

        int bin = 0b1111; // 8+4+2+1 = 15
        int oct = 0242; // 128+32+2 = 162
        int hex = 0xb9f; // 256*11+16*9+15 = 2975

        System.out.println("binary = "+bin);
        System.out.println("oct = "+oct);
        System.out.println("hex = "+hex);

        // 진수로 출력하기
        System.out.println("binary 진수 = "+Integer.toBinaryString(bin));
        System.out.println("oct 진수 = "+Integer.toOctalString(oct));
        System.out.println("hex 진수 = "+Integer.toHexString(hex));
    }
}
