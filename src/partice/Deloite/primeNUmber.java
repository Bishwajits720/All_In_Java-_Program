package partice.Deloite;

import java.util.*;

public class primeNUmber {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int x = sc.nextInt();
        int c = 0;
        if (x <  2) System.out.println("not prime num");
        else {
            for (int i = 1; i <= x ; i++) {
                if (x % i == 0){
                    c+=1;
                }
            }
            if (c >2){
                System.out.println("not ");
            }else {
                System.out.println("prime ");
            }
        }
    }


}
