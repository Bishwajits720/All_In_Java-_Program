package arrayspractice;

import java.sql.Array;
import java.util.*;

public class dublicatearray {
    public static void main(String[] args) {

        Integer arr[] = {1,2,3,4,1,2,5,7};
        for (int i = 0; i <arr.length ; i++) {
            for (int j = i+1; j <arr.length ; j++) {
                       if (arr[i] ==arr[j]){
                           System.out.println(arr[i]);
                       }
            }
        }


    }
}
