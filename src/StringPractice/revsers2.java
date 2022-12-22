package StringPractice;

import java.util.Arrays;

public class revsers2 {
    public static void main(String[] args) {

        String str = "my name is biswajit";
        reverse(str);

    }
    static String[] reverse(String  str){

        String rev[] = str.split("a");

        System.out.println(Arrays.toString(rev));

        System.out.println(rev[1]);

        for (int i = rev.length-1; i >= 0; i--) {
            System.out.print(rev[i] + " ");

        }



        return rev;

    }
}
