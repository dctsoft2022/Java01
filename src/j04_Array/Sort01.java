package j04_Array;

import java.util.Arrays;
import java.util.Random;

public class Sort01 {
    public static void main(String[] args) {
        // 1. 최대, 최소값 구하기
        // 2. 정렬

        // * 오름차순 정렬
        // 1. 배열생성
        int[] lotto = new int[6];
        Random rn = new Random();
        for (int i = 0;i< lotto.length;i++){
            lotto[i] = rn.nextInt(45)+1;
            // 중복확인
            for (int j = 0;j<i;j++){
                if (lotto[i]==lotto[j]) --i; break;
            }//for_j
        }//for_i
        System.out.println("정렬전 lotto = "+ Arrays.toString(lotto));
        // 2. 오름차순정렬
        // 순차정렬
        for (int i =0;i< lotto.length;i++){
            for (int j =i+1;j< lotto.length;j++){
                if (lotto[i]>lotto[j]) {
                    int temp;
                    temp = lotto[i];
                    lotto[i] = lotto[j];
                    lotto[j] = temp;
                }//if
            }//for_j
        }//for_i
        System.out.println("정렬후 lotto = "+Arrays.toString(lotto));

        // * Arrays.sort 를 이용한 오름차순정렬
        int[] lotto1 = new int[6];
        Random rn1 = new Random();
        for (int i = 0;i< lotto1.length;i++){
            lotto1[i] = rn1.nextInt(45)+1;
            // 중복확인
            for (int j = 0;j<i;j++){
                if (lotto1[i]==lotto1[j]) --i; break;
            }//for_j
        }//for_i
        System.out.println("sort 정렬전 lotto1 = "+ Arrays.toString(lotto1));
        Arrays.sort(lotto1);
        System.out.println("sort 정렬후 lotto1 = "+ Arrays.toString(lotto1));
    }//main
}
