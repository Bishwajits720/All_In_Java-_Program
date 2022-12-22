package StringPractice;

import java.util.Arrays;

public class reverse1 {
    public static void main(String[] args) {

        String str =" my name is bishwajit sahu";

       reverse11(str);


    }

    static void reverse11(String str){

        String[] rev = str.split(" ");

        System.out.println(Arrays.toString(rev));
        System.out.println(rev[1]);
       System.out.println(rev[rev.length -1]);

    }
}
