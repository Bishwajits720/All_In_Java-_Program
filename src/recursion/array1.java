package recursion;

public class array1 {
        static void SumOfEven(int arr[] ,int i)
        {

            if ((arr[i]) % 2!= 0)
            {
                System.out.println(arr[i]);

            }

            SumOfEven(arr, i - 1);
        }

        public static void main (String[] args)
                throws java.lang.Exception
        {
            int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8,9,10 };
            int n = arr.length;


            SumOfEven(arr, n - 1);
        }
    }

