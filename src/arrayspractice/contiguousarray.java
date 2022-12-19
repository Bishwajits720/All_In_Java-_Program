package arrayspractice;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

class sol4{
    public int findlength(int[] arr){
        HashMap<Integer,Integer> counts = new HashMap<>();
        counts.put(0,-1);

        int max =0;
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 0){
                count += -1;
            } else {
                count += 1;
            }
            if(counts.containsKey(count)){
                max= Math.max(max,i-counts.get(count));
            }else {
                counts.put(count,i);
            }
        }



        return max;
    }
}

public class contiguousarray {
    public static void main(String[] args) {
        int arr[] ={0,1,0,1};
        sol4 s = new sol4();
        System.out.println(s.findlength(arr));
    }
}
