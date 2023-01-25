package Maths.DSA.practice;

public class factorNUmber {
    public static void main(String[] args) throws Exception {

        int n  = 120;
        factor(n);



    }
    public static void factor(int n ){
        for (int i = 1; i <n ; i++) {

            if (n % i == 0){
                System.out.print(i + " ");

            }
        }
    }

}
