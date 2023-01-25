package Maths.DSA;
// x-or it find  not dublicate element

public class Findunique {
    public static void main(String[] args) {
        int arr[] = {2,3,3,4,2,6,4,6};
        System.out.println(ans(arr));

    }
    static int ans(int arr[]){
       int x = 0 ;

       for(int n :arr){
           x = x ^n;

       }
       return x;


    }
}
