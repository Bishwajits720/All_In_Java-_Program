package partice;

import java.util.ArrayList;
import java.util.Scanner;

public class StringLength {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        String s =sc.next();
        String c="";

        char[] ch =s.toCharArray();


        for (int i = 0; i < ch.length; i++) {
           if (ch[i] != 'a' && ch[i] != 'i' && ch[i] !='o') {
               c =c + ch[i];
           }
        }
        System.out.println(c);
    }
}
