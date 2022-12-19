package arrayspractice;


class soln{
    public int maxsumarray(int[] arr){
        // int[] ={-2,2,5,-11,6};   max sum = 7
      int max =arr[0];
      int current = max;
        for (int i = 1; i < arr.length ; i++) {
            current = Math.max(arr[i]+current, arr[i] );
            max = Math.max(current,max);
        }
     return max;
    }


    public int minsumarray(int[] arr){
        // int[] ={-2,2,5,-11,6};   max sum = 7
        int max =arr[0];
        int current = max;
        for (int i = 1; i < arr.length ; i++) {
            current = Math.min(arr[i]+current, arr[i] );
            max = Math.min(current,max);
        }
        return max;
    }


}

public class maxSUMarray {
    public static void main(String[] args) {
        soln s =new soln();
        int arr[] = {-2,2,5,-11,6};
        System.out.println(s.minsumarray(arr));
        System.out.println(s.maxsumarray(arr));
    }
}
