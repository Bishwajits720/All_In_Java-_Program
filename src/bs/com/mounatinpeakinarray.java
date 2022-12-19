package bs.com;

public class mounatinpeakinarray {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 7, 5, 4, 3, 2};
       // int target = 8;
        System.out.println(peak(arr));

    }
   static int search(int [] arr, int target){
        int peak1= peak(arr);
        int firsttry =orderagnosticBS(arr,target,0 ,peak1);
        if(firsttry!=-1){
            return firsttry;
        }
        return orderagnosticBS(arr,target,peak1+1, arr.length-1);

    }

    static int peak(int arr[]) {
        int start = 0;
        int end = arr.length-1;
        while (start < end) {

            int mid = start + (end - start) / 2;

            if (arr[mid] > arr[mid+1]) {
                end = mid;
            } else {
                start = mid + 1;
            }


        }

        return arr[start];

    }
    static int orderagnosticBS(int[] arr, int target, int start , int end) {


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

