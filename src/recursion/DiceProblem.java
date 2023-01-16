package recursion;

import java.util.ArrayList;

public class DiceProblem {
    public static void main(String[] args) {
         ArrayList<Integer> arr = new ArrayList<>();
        System.out.println(dice("",4,arr));

    }
    static ArrayList<Integer> dice(String p , int target , ArrayList<Integer> arr){
        if (target == 0){
            if (p.length() ==2){
                arr.add(Integer.valueOf(p));
               return arr;

            }
        }

        for (int i = 1; i <=6 && i<= target ; i++) {
            dice(p+i , target-i,arr);
        }

   return arr;
    }
}
