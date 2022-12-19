package recursion;


 public class evenarray{
     public static void main(String[] args, int i)
     {
         int L = 10, R = 25;
         double[] arr ={1,2,3,4,5,6,7,8,};
         System.out.print("Even numbers:");


         Even(L, R, arr, i++);
         System.out.println();


     }


    static void Even(int L, int R, double[] arr, int i)
    {



        if(arr[i] % 2 == 0 )
            Even(L, R - 2, arr, i);
        else
            Even(L, R - 1, arr, i);

        if (arr[i] % 2 == 0)
        {
            System.out.print(R + " ");
        }
    }




}
