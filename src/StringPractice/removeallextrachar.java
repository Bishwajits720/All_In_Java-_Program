package StringPractice;

import java.util.*;

public class removeallextrachar {
    public static void main(String[] args) {
       String str ="m@!!@# 4em i#s bi34swa4jit";
        System.out.println(remove(str));


    }
    static String remove(String str){

        for (int i = 0; i <str.length() ; i++) {

            if (str.charAt(i) < 'A' || str.charAt(i) > 'Z'  && str.charAt(i) < 'a' || str.charAt(i) > 'z' ){

                str = str.substring(0,i) + str.substring( i+1  );
                i--;



            }

        }


    return str;


    }
}
