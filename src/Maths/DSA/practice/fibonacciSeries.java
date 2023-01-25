package Maths.DSA.practice;

public class fibonacciSeries {
    public static void main(String[] args) {

        series(9);


    }
    static void series(int n ){
        int f = 0;
        int s = 1;

        System.out.println(f);
        System.out.println(s);

        for (int i = 1; i <=n -2 ; i++) {
            int t = f +s;
            System.out.println(t);
            f= s;
            s= t;

        }
    }
}
