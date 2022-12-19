package bs1.com;

public class findinrotatedarray {
    public static void main(String[] args) {
        int arr[] = {11, 12, 15, 18, 2, 5, 6, 8};
        //int target = 15;
        System.out.print("index of the target element =");
        System.out.print(search(arr,5));
    }

    static int search(int arr[], int target) {

        int s = 0;
        int e = arr.length - 1;
        while (s <= e) {
            int m = s + (e - s) / 2;
            if (arr[m] == target)
                return m;

                  if(arr[s] <= arr[m]) {
                    if (arr[s] <= target && target <= arr[m])
                         e = m - 1;
                    else
                        s = m + 1;
                } else {
                    if (arr[m] <= target && target <= arr[e])
                        s = m + 1;
                    else
                        e = e - 1;

                }

            }

        return -1;
    }
}