package j04_Array;

public class Array01 {
    public static void main(String[] args) {

        // 1. 명시적 선언 (new 연산자 이용)
        // 크기를 반드시 지정
        int[] score;
        int len = 6;
        score = new int[len];
        for (int i = 0;i<score.length;i++){
            score[i] = (i+1)*10;
        }
        for (int i=0;i< score.length;i++){
            System.out.println("score ("+i+")= "+score[i]);
        }

        // 2. 묵시적 선언
        // 선언과 동시에 초기화
        int[] score1 = {1, 2, 3, 4, 5, 6};
        for (int i=0;i< score1.length;i++){
            System.out.println("score1 ("+i+")= "+score1[i]);
        }
    }
}
