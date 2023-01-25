package Maths.DSA;

import java.util.*;

public class HCFandLCM {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        int m1 = n1;
        int m2 = n2;

        while( n1 % n2 !=0){
            int rem = n1 % n2;     //int rem = n1 % n2;
                                   // n1 = n2 ;
                                   // n2 =rem;
            n1 = n2;
            n2 = rem;

        }
        int hcf = n2;
        int lcm = (m1 * m2) /hcf;

        System.out.println(hcf);
        System.out.println(lcm);

    }
}
