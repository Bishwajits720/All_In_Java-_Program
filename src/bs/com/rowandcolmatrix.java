package bs.com;

import java.util.Arrays;

public class rowandcolmatrix {
    public static void main(String[] args) {
        int [][] arr= { {10,20,30,40},
                {23,25,35,50},
                {28,29,37,52},
                {33,34,38,55}
        };
        System.out.println(Arrays.toString(search(arr, 37)));


    }

    static int[] search(int[][] matrix ,int target ){

        int r= 0;
        int c= matrix.length -1;

        while(r < matrix.length -1){
            if (matrix[r][c] == target){
                return new int[]{r,c};
            }
            if (matrix[r][c] < target){
                r++;

            }else {
                c--;
            }
        }
       return new int[]{-1,-1};
    }
}
