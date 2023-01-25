package Maths.DSA.practice;

public class GCDrecursion {
    public static void main(String[] args) throws Exception {
        int a = 50 ;
        int b = 60;

        int ans = findGCD(a,b);
        System.out.println(ans);

    }
    public static int findGCD(int a , int b){

        if(a % b ==0)
            return b;
        else
            return findGCD(b , a%b);


    }
}
