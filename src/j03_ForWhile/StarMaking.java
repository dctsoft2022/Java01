package j03_ForWhile;

public class StarMaking {
    public static void main(String[] args) {
        //마름모 만들기 연습
        int x = 9;
        for (int i=1;i<=x/2;i++){
            for (int j=1;j<=x;j++){
                if (((x/2+1)-i)<j&&j<((x/2+1)+i)){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }//for j
            System.out.println();
        }//for i
        for (int i=(x/2);i>0;i--){
            for (int j=x;j>0;j--){
                if (((x/2+1)-i)<j&&j<((x/2+1)+i)){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }//for j
            System.out.println();
        }//for i

        // 마름모 만들기 답지
        int line = 5;
        for (int i=1; i<=line; i++) {
            for(int j=1;j<=line-i; j++) {
                System.out.print(" ");
            }
            for(int j=1;j<i*2; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i=4; i>=1; i--) {
            for(int j=1;j<=line-i; j++) {
                System.out.print(" ");
            }
            for(int j=1;j<i*2; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }//main
}//class
