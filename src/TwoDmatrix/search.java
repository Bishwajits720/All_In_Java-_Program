package TwoDmatrix;

import java.util.Arrays;

public class search {
    public static void main(String[] args) {
       int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
        display(arr);
        search1(arr,6);

    }
    static void search1(int arr[][] ,int target){

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <arr[1].length ; j++) {
                if (arr[i][j] == target){
                    System.out.println(i +" " +j);
                }
            }
        }


    }
    static void display(int arr[][]){
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                System.out.print(arr[i][j] +" ");
            }
            System.out.println( " ");
        }

    }
}
