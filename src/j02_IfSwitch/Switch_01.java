package j02_IfSwitch;

import java.util.Scanner;

public class Switch_01 {
    public static void main(String[] args) {

        // switch - case - break
        // 1. switch(key)문의 인자로 사용가능 Type (int, char, String)
        // 2. break : 무조건 탈출
        Scanner sc = new Scanner(System.in);
        int month;
        System.out.println("몇 월입니까?");
        month = sc.nextInt();
        sc.close();
        switch (month){
            case 12:
            case 1:
            case 2: System.out.println("겨울입니다.");
                break;
            case 3: case 4: case 5: System.out.println("봄입니다.");
                break;
            case 6: System.out.println("더운 ");
            case 7: System.out.println("여름");
            case 8: System.out.println("입니다");
                break;
            case 9: System.out.println("9월입니다."); break;
            case 10: System.out.println("10월입니다."); break;
            case 11: System.out.println("11월입니다."); break;
            default: System.out.println("12월을 넘어갔습니다.");
                break;
        }//switch
    }//main
}//class
