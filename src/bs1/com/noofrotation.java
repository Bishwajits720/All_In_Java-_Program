package bs1.com;

public class noofrotation {
    public static void main(String[] args) {
        int arr[] ={11,12,15,18,2,4,6,8};
        System.out.println(rotation(arr));


    }

    static int rotation(int[] arr) {
        if (arr.length == 0) return -1;
        if (arr.length == 1) return arr[0];

        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (mid > 0 && arr[mid] < arr[mid - 1]) {
                return arr[mid];
            } else if (arr[start] <= arr[mid] && arr[mid] > arr[end]){
                start = mid + 1;

            } else {
                end = mid - 1;
            }

        }
        return arr[start -1];
    }
}



