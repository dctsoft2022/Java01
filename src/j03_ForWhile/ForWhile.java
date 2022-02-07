package j03_ForWhile;

public class ForWhile {
    public static void main(String[] args) {

        // 무한루프
        // 1. for
        int count = 0;
        for (;;){
            if (count%10==0) System.out.println(count);
            count++;
            if (count>1000) break;
        }//for

        // 2. while
        count = 0;
        while (true){
            if (count%11==0) System.out.println(count);
            count++;
            if (count>1000) break;
        }//while

        // 3. do_while
        count = 0;
        do{
            if (count%12==0) System.out.println(count);
            count++;
            if (count>1000) break;
        }while (true);
        System.out.println("stop");
    }
}
