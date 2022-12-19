package bs1.com;

public class firstandlastelementSA {
    public static void main(String[] args) {
        int[] arr = {2, 4, 10, 10, 10, 18, 20};
        int target = 10;
        System.out.println( BS1(arr, 10));
        System.out.println( BS2(arr,10));

    }

    static int BS1(int arr[], int target) {
        int start = 0;
        int end = arr.length - 1;
        int res1 = -1;


        while (start <= end) {
            int mid = start + (end - start) / 2;
            {
                if (target == arr[mid]) {
                    res1 = mid;
                    end = mid - 1;
                } else if (target < arr[mid]) {

                    end = mid - 1;

                } else {
                    start = mid + 1;
                }

            }

        }
        return res1;
    }

    static int BS2(int arr[], int target) {
        int start = 0;
        int end = arr.length - 1;
        int res2 = -1;


        while (start <= end) {
            int mid = start + (end - start) / 2;
            {
                if (target == arr[mid]) {
                    res2 = mid;
                    start = mid + 1;
                } else if (target < arr[mid]) {


                    end = mid - 1;

                } else {


                    start = mid + 1;
                }

            }

        }

        return (res2);
    }
}
