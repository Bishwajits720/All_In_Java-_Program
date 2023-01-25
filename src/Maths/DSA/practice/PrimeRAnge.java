package Maths.DSA.practice;

public class PrimeRAnge {
    public static void main(String[] args) throws Exception{

        int s =10;
        int e =40;

        for (int i = s; i <=e ; i++) {
            int c = 0;

            for (int j = 2; j*j <=i ; j++) {
                if (i % j ==0){
                    c++;
                    break;
                }

            }
            if (c==0){
                System.out.println(i);
            }
        }


    }
}
