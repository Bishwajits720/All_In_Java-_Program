package bs.com;

public class binarysearch {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5,6,7,8,9,25,27,29,30};
        int target = 29;
        int ans = binarysearch1(arr,target);
        System.out.println( ans);

    }

    static int binarysearch1(int[] arr, int target) {
        int start =0;
        int end =arr.length -1;

        while (start <= end){

            //int mid = (start+ end) /2;

            int mid = start +(end - start)/ 2;

            if (target < arr[mid]){
                end = mid -1;
            }else if (target > arr[mid]){
                start= mid +1;
            } else {
                return mid;
            }
        }
      return -1;
    }
}
