package Maths.DSA.practice;

import java.nio.file.Path;

public class LCMrecursion {
    public static void main(String[] args) throws Exception {
        int a = 40;
        int b = 60;
        int x = lcmfind(a , b);
        int lcm = (a * b) /x;
        System.out.println(lcm);



    }
    public static int lcmfind(int a , int b){
        if (a % b ==0){
            return b;
        }else {
            return lcmfind(b, a % b);

        }
    }
}
