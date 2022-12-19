package recursion;

class newww {
    static void ary(int arr[],int i  )
    {

      //  for(i=0;i<arr.length;i++)
        if(arr[i]%2==0)
            {
                System.out.println(arr[i]);
            }



        ary(arr,i-1);
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4};

      int n= arr.length;
        System.out.println("even numbers are");
        ary(arr,n-1);

       }
}
