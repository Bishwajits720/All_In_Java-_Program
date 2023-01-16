package StringPractice;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class Subset11 {
    public static void main(String[] args) {
      int arr[] = {1,2,3};
        System.out.println(subset11(arr));


    }
    static List<List<Integer>> subset11(int [] arr){
        List<List<Integer>> res = new ArrayList<>();
        res.add(new ArrayList());

        for (int num :arr){
               int n =res.size();
            for (int j = 0; j < n; j++) {
                List<Integer> temp = new ArrayList(res.get(j));
                temp.add(num);
                res.add(temp);
            }
        }
      return res;
    }
}
