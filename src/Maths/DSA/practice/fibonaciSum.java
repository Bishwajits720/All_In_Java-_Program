package Maths.DSA.practice;

public class fibonaciSum {
    public static void main(String[] args) throws Exception {

        int s = 0;
        int e = 1;
        int k = 10;
       int ans = fibSum(s,e,k);
        System.out.println(ans);

    }
    static int fibSum(int s , int e , int  k){

        int t =0;

        for (int i = 1; i <= k-2 ; i++) {
            t = s +e;
            s= e;
            e =t;
        }


       return t;
    }
}
