package Maths.DSA.practice;

public class reverseNUmber {
    public static void main(String[] args) throws Exception {
        int n = 12345;
        reverse(n);

    }
    public static void reverse(int n){

        int rev = 0;
        while(n >0){
            int rem = n % 10;
            rev = (rev * 10) +rem;
            n = n/10;
        }
        System.out.println(rev);

    }
}
