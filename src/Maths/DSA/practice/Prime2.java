package Maths.DSA.practice;

public class Prime2 {
    public static void main(String[] args) throws Exception{
      int n  = 39;
       primeNumber(n);
    }
    static void primeNumber(int n){
        int c =0;
        for (int i = 2; i*i<=n ; i++) {
            if (n%i == 0){
                c++;
            }
        }
        if (c %2 ==0){
            System.out.println("prime");
        }else {
            System.out.println("not prime");
        }
    }
}
