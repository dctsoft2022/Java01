package j03_ForWhile;

public class ContinueBreak {
    public static void main(String[] args) {
        apple:
        for (int i=1; i<=5; i++){
            banana:
            for (int j=1; j<=7; j++){
                if(i==j) continue banana;
                System.out.printf("[%d,%d]",i,j);
                if (i==4&&j==2) break banana;
                if (i==5&&j==3) break apple;
            }
            System.out.println();
        }//for
    }
}
