package bs.com;

import java.util.Arrays;

public class searchin2darray {
    public static void main(String[] args) {
        int[][] arr = {
                {23, 4, 1},
                {12, 45, 2, 9},
                {78, 43, 23, 323},
                {34, 76}
        };
        int target =  8;
        int[] ans = search(arr, target);
        System.out.println(Arrays.toString(ans));
    }





    static int[] search(int[][] arr, int target) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target) {
                    return new int[]{row, col};

                }

            }
        }
        return new int[]{-1, -1};

    }

}





