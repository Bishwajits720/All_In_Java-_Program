package TCSpractice;

public class searchinmountainarray {
    public static void main(String[] args) {
     int arr[] = {1,3,5,7,9,8,6,4,2};
        System.out.println(search(arr,4));

    }
   static int search(int arr[] ,int target){
        int peak1 = peak(arr);
     int first = orderagnosticBS(arr,target,0,peak1);
     if (first != -1){
         return first;
     }
     return orderagnosticBS(arr,target,peak1+1,arr.length-1);

    }
    static int peak(int arr[]){
        int start = 0;
        int end = arr.length -1;
        while(start<end){
            int mid = start +(end - start)/2;
            if (arr[mid] >arr[mid +1]){
                end = mid;
            } else {

                start = mid + 1;
            }

        }
        return start;
    }


    static int orderagnosticBS(int[] arr, int target,int start,int end) {

        boolean isAsc;
        isAsc = arr[start] < arr[end];


        while (start <= end) {

            //int mid = (start+ end) /2;

            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {

                return mid;
            }
            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid = 1;
                } else {
                    start = mid + 1;
                }

            } else {
                if (target > arr[mid]) {
                    end = mid = 1;
                } else {
                    start = mid + 1;
                }
            }

        }
        return -1;
    }


}
