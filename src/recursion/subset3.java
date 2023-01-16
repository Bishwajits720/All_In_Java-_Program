package recursion;

import java.util.*;

public class subset3 {
    public static void main(String[] args) {

        subsett("" , 8);


    }
    static void subsett(String p , int start ){
        if (start == 0) {
            if (p.length() == 2) {
                System.out.println(p);
                return;
            }
        }

        for (int i = 1; i <=6 && i<=start ; i++) {

            subsett(p+i,start-i);

        }

    }
}
