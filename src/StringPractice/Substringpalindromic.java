package StringPractice;

import java.util.*;

public class Substringpalindromic {
    public static void sol(String str){

        for (int i = 0; i < str.length(); i++) {
            for (int j = i+1; j <=str.length() ; j++) {
                  String ss = str.substring(i,j);
                if(isplandrome(ss)){
                    System.out.println(ss);
                }
            }
        }
    }
    public static Boolean isplandrome(String ss){
        int i = 0;
        int j= ss.length() -1 ;
        while (i <= j){
            char c1= ss.charAt(i);
            char c2 =ss.charAt(j);

            if (c1 != c2){
                return false;
           }else {
                i++;
                j--;
            }

        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        sol(str);

    }

}
