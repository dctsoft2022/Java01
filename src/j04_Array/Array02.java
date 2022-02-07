package j04_Array;

public class Array02 {
    public static void main(String[] args) {

        String[] group1 = {"my", "name", "is", "min"};
        for (String g: group1){
            System.out.print(g+" ");
        }
        System.out.println();
        // Multi
        // 1. 명시적 선언
        int[][] mul = new int[2][3]; // [행][열]
        mul[0][0] = 1;
        mul[0][1] = 2;
        mul[0][2] = 3;
        mul[1][0] = 4;
        mul[1][1] = 5;
        mul[1][2] = 6;
        // => {{1, 2, 3}, {4, 5, 6}}
        for (int i=0;i< mul.length;i++){
            for (int j=0;j<mul[i].length;j++){
                System.out.printf("mul[%d][%d] = %d\n",i,j,mul[i][j]);
            }//for_j
        }//for_i

        // 2. 묵시적 선언
        int[][] mul1 = {{10, 20, 30}, {40, 50, 60}};
        for (int i=0;i< mul1.length;i++){
            for (int j=0;j<mul1[i].length;j++){
                System.out.printf("mul1[%d][%d] = %d\n",i,j,mul1[i][j]);
            }//for_j
        }//for_i
    }
}
