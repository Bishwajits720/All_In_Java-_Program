package bs1.com;


import java.util.ArrayList;
import java.util.List;

public class spiralmatrix {
    public static void main(String[] args) {
        int arr[][] = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
       // System.out.println(spiralOrder());
                

    }

         //public list<Integer> order(int[][] matrix) {
    //list<Integer> res = new ArrayList();
    //class solution{
     static List<Integer> spiralOrder(int[][] arr) {
         List<Integer> res = new ArrayList();
         int RB = 0;
         int CB = 0;
         int RE = arr.length - 1;
         int CE = arr[0].length - 1;

         while (RB <= RE && CB <= CE) {
             for (int i = CB; i <= CE; i++) {
                 res.add(arr[CB][i]);
             }
             RB++;
             for (int i = RB; i <= RE; i++) {
                 res.add(arr[i][CE]);
             }
             CE--;
             if (RB <= RE) {
                 for (int i = CE; i >= CB; i--) {
                     res.add(arr[RE][i]);
                 }
             }
             CE--;
             if (CB<=CE){
                 for (int i = RB; i >=RB ; i--) {
                     res.add(arr[i][CB]);
                 }
             }
             CB--;

         }
     return res;
     }

    }


