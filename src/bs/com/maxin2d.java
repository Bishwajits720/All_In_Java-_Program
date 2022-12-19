package bs.com;


import java.util.Arrays;

    public class maxin2d {
        public static void main(String[] args) {
            int[][] arr = {
                    {23, 4, 1},
                    {12, 45, 2, 9},
                    {78, 43, 23, 323},
                    {34, 76}
            };

            int ans = max(arr);
            System.out.println(ans);
        }

        static int max(int[][] arr) {
            int max =Integer.MIN_VALUE;
            for (int row = 0; row < arr.length; row++) {
                for (int col = 0; col < arr[row].length; col++) {
                    if (arr[row][col] > max) {
                       max= arr[row][col];

                    }

                }
            }
            return max;

        }

    }






