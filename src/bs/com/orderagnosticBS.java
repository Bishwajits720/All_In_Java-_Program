package bs.com;

public class orderagnosticBS {
    public static void main(String[] args) {
       // int[] arr ={1,2,3,4,5,6,7,8,13,24,35,46,57,78,89};
        int [] arr={99,77,66,55,44,33,22,11};

        int target = 77;
        int ans= orderagnosticBS(arr ,target);
        System.out.println( ans);

    }

    static int orderagnosticBS(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
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

