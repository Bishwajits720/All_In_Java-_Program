package Maths.DSA.practice;

public class ncr {
    public static void main(String[] args) throws Exception {

        int n = 5;
        int r = 3;

        int res1 =  ncr1(n) /(ncr1(n-r)* ncr1(r));
        System.out.println("ncr " + res1);

        int res2 = ncr1(n) /ncr1(n-r);
        System.out.println("npr " + res2);
    }
    static int ncr1(int n ){
        int f = 1;
        for (int i = 1; i <=n ; i++) {
            f = f*i;
        }

          return f;
    }
}
