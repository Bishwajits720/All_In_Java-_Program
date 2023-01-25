package Maths.DSA.practice;

public class tabels {
    public static void main(String[] args) throws Exception {
        int s = 1;
        int e = 10;
        tables(s,e);
    }
    static void tables(int s , int e){
        for (int i = s; i <=e ; i++) {
            for (int j = s; j <=e ; j++) {
                System.out.print (j +" X " +i +" = " + i*j +"   ");
            }
            System.out.println();
        }
    }
}
