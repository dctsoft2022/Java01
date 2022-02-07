package j05_ClassMethod;

public class CM05_Factorial {
    // 재귀적 호출 : 메서드 내부에서 자신을 호출
    public static int factorial(int n){
        if (n==1) return n;
        else return n*factorial(n-1);
    }//factorial

    public static void main(String[] args) {
        System.out.println("10! = "+factorial(10));
        System.out.println("5! = "+factorial(5));
    }//main
}
