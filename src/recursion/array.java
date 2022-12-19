package recursion;

public class array {
    public static void main(String[] args) {

        int[] arr ={1,2,3,4,5,6,7,8,};
        System.out.print("Even numbers:");
        int i =0;
        Even( arr, i++);
        System.out.println();
    }
    static void Even( int [] arr, int i)
    {

        if(arr[i] % 2 == 0 ) {
            Even(arr, i++);
        }
        for (int j = 0; j <arr.length; j++) {
            System.out.print(arr[i] + " ");
        }


    }
    }
