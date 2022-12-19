package partice;

import java.util.*;

public class Amrstrong {
    public static void main(String[] args) {
        int num =1634;
        System.out.println(isarmstrong(num));
    }
    static boolean isarmstrong(int num){

        int digits =0, temp ,sum = 0;
        temp = num;
        while(temp >0){
              temp = temp /10;
              digits++;
        }
        temp = num;
        while(temp > 0){
            int last = temp%10;
           sum = (int)(sum + Math.pow(last,digits));
           temp = temp /10;
        }
        if (sum == num){
            return true;
        }

     return false;
    }
}
