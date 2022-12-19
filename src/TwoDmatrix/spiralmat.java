package TwoDmatrix;

import java.util.*;

public class spiralmat {
    public static void main(String[] args) {
        int arr[][] ={{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(spiral(arr));

    }
   static List<Integer> spiral( int[][] arr){
        List<Integer> res = new ArrayList<>();

        if (arr.length ==0) return res;
        int cb =0;
        int rb =0;
        int re = arr.length-1;
        int ce =arr[0].length-1;

        while (rb<=re && cb<=ce){

            for (int i = cb; i <=ce ; i++) {
                res.add(arr[rb][i]);
            }
            rb++;
            for (int i = rb; i <=re ; i++) {
                res.add(arr[i][ce]);
            }
            ce--;
            if (rb<=re){
                for (int i = ce; i >=cb ; i--) {
                     res.add(arr[re][i]);
                }
            }
            re--;
            if (cb <=ce){
                for (int i = re; i >=rb ; i--) {
                    res.add(arr[i][cb]);
                }
            }
            cb++;
        }

   return  res;
    }
}
