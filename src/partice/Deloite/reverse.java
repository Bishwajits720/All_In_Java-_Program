package partice.Deloite;

import java.util.*;


public class reverse {
    public static void main(String[] args){
        int x = 1234,rev = 0, rem ;


        while(x!=0){
            rem = x %10;
            rev= rev *10 +rem;
            x= x/10;

        }
        System.out.println(rev);

    }
}
