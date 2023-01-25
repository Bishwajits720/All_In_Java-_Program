package Maths.DSA.practice;

public class Armstrong {
    public static void main(String[] args) throws Exception {

        int x = 1513;
    isArmstrong(x);

    }
    static void isArmstrong( int x){
        int sum = 0 ;
        int n = x;

        while (x > 0){

            int rem = x % 10;
            sum = (rem * rem * rem ) +sum;
            x = x/10;

        }
      if (sum==n){
          System.out.println("armstrong");
      }else {
          System.out.println(" not armstrong");
      }

    }

}
