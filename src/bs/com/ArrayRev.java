package bs.com;

import java.util.Arrays;

public class ArrayRev {
    public static void main(String [] args){
        int []  arr = {11,12,13,14,15};
        System.out.println("Array are:");
        int n= arr.length;
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+ " ");
        }
//        System.out.println();
//        System.out.println("reverse of Array:");
//        for (int i=n-1;i>=0;i--)
//        {
//            System.out.print(arr[i]+ " ");
////        }
         reverseArry(arr,0,n-1);
        System.out.println(Arrays.toString(arr));
    }
    static void reverseArry(int [] arr,int s,int e){
        if(s>e) return;
        int temp=arr[s];
        arr[s]=arr[e];
        arr[e]=temp;
        reverseArry(arr,s+1,e-1);
    }

}
