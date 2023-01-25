package StringPractice.DSA;

import java.util.*;
public class reverseString {
    public static void main(String[] args) throws Exception {
        String str = "bishwajit";

        reverse(str);

    }
    static void reverse(String  str){

        String rev ="";
        int l = str.length()-1;

        for (int i = l; i >=0 ; i--) {
            rev =rev +str.charAt(i);
        }
        System.out.println("reversed String is :" + rev);



    }
}
