package partice;

import java.util.*;

class sol2{
    public void find(int x){

        if (x % 400 ==0){
            System.out.println(x +" is a leap Year");
        }else if(x % 4 ==0 & x %100 !=0){
            System.out.println(x +" is a leap year");
        }else {
            System.out.println(x +" not a leap year");
        }
    }

}



public class leapNumber {
    public static void main(String[] args) {

        sol2 sol = new sol2();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the year");
        int year = sc.nextInt();
        sol.find(year);
    }

}
