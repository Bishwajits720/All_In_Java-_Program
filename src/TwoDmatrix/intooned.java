package TwoDmatrix;

import java.util.*;

public class intooned {
    public static void main(String[] args) {
        int arr[][] ={{1,2,3,4},{5,6,7,8},{9,10,11,12}};

        System.out.println(into(arr));

    }
    static List<Integer> into(int arr[][]){

        List<Integer> l = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                l.add(arr[i][j]);
            }
        }
       return l;
    }
}
