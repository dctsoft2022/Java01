package j05_ClassMethod;

public class CM06_Static {
    int result ;
    static int total ;

    public int adder (int i , int j) {
        result = i+j;
        total += result;
        return result;
    }//adder

    public int min (int i , int j) {
        int result= 0; //지역변수 우선
        this.result = i-j; //전역변수 표기 : this.result
        result = i-j;
        total += result;
        return result;
    }//min

    public static int mul (int i , int j) {
        int result = i*j; //지역변수
        total += result; //같은 static에 total이 있어야한다.
        return i*j;
    }//mul

    public static double div (int i , int j) {
        double result = (double)i/j;
        total += result;
        return result;
    }//div

    public static void main(String[] args) {

        //** non_static instance 맴버
        CM06_Static cm06 = new CM06_Static();
        System.out.println("total test = "+ total); // 0
        System.out.println("adder = "+ cm06.adder(19,7)); // 26
        System.out.println("min = "+ cm06.min(14,8)); // 6
        System.out.println("result test = "+ cm06.result); // 6
        System.out.println("final total = "+ total);  // 32

        // -----------NEW------------------------
        CM06_Static cm06New = new CM06_Static();
        System.out.println("New total test = "+ cm06New.total); // 32
        //오류는 아니지만 경고: 접근방법이 바람직하지 않습니다.
        System.out.println("New adder = "+ cm06New.adder(19,7)); // 26
        System.out.println("New min = "+ cm06New.min(16,5)); // 11
        System.out.println("New result test = "+ cm06New.result); // 11
        System.out.println("New final total = "+ total); // 69
    }//main
}
