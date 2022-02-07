package j05_ClassMethod;

import java.util.Arrays;
import java.util.Random;

public class CM03_CallbyRef {
    public void mySort(int[] lo){
        System.out.println("lo 주소 = "+lo);
        for (int i=0;i<lo.length;i++){
            for (int j=i+1;j<lo.length;j++){
                if (lo[i]>lo[j]){
                    int temp;
                    temp=lo[i];
                    lo[i]=lo[j];
                    lo[j]=temp;
                }//if
            }//for_j
        }//for_i
    }//mySort

    public static void main(String[] args) {
        int[] lotto = new int[6];
        Random rn = new Random();
        for (int i = 0;i< lotto.length;i++){
            lotto[i] = rn.nextInt(45)+1;
            // 중복확인
            for (int j = 0;j<i;j++){
                if (lotto[i]==lotto[j]) --i; break;
            }//for_j
        }//for_i
        System.out.println("lotto 주소 = "+lotto);
        System.out.println("lotto = "+ Arrays.toString(lotto));
        // 정렬
        CM03_CallbyRef doSort = new CM03_CallbyRef();
        doSort.mySort(lotto);
        System.out.println("doSort lotto 주소 = "+lotto);
        System.out.println("lotto = "+Arrays.toString(lotto));
    }
}//class
