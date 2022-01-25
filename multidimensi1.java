package dat.src;

import java.util.Arrays;

public class multidimensi1 {
    public static void main(String[] args) {
        int array1_2d [][]={
            {1,2,3},
            {4,5,6},
            {3,4},
            {10},
            {1,2,3,4,5,6},
        };
        array2d(array1_2d);

        System.out.println("\n\n");

        int array2_2d[][];
        array2_2d=new int [array1_2d.length+1][array1_2d.length+1];
        for(int i=0;i<array2_2d.length;i++){
            for(int j=0;j<array2_2d.length;j++){
                array2_2d[i][j]=j;
                System.out.printf("%d,",array2_2d[i][j]);
            }
            System.out.printf("\n");
        }
    }
    private static void array2d(int array[][]){
        System.out.println(Arrays.deepToString(array));
    }
}
