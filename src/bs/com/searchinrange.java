package bs.com;


import java.util.Scanner;

public class searchinrange {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int[] arr={ 18,32,44,534,5,54,43,30,3,23,};
        int target = in.nextInt();
        System.out.println(linearsearch(arr,target,1,4));

    }
    static int linearsearch(int[] arr, int target ,int start ,int end) {
        if (arr.length == 0) {
            return -1;
        }
        for (int index = start; index <= end; index++) {
            int element = arr[index];
            if (element == target) {
                return index;

            }

        }
        return -1;

    }

}


