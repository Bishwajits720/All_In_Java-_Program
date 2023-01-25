package Maths.DSA.practice;

public class commonTwoFactor {
    public static void main(String[] args) throws Exception{
         int  a = 12;
         int b = 18;
         commomfactor(a , b);



    }
    public static void commomfactor(int a , int b){

        for (int i = 1; i < Math.max(a,b) ; i++) {

                if (a % i == b % i){
                    System.out.println(i +" ");
                }


        }




    }
}
