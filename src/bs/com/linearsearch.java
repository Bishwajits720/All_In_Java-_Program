package bs.com;

public class linearsearch {
    public static void main(String[] args) {
        int[] nums = {21, 32, 43, 42, 24, 45, 75, 88};
        int target =88;
        int ans = linearsearch(nums, target);
        System.out.println(ans);
    }

    static int linearsearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }
            for (int index = 0; index < arr.length; index++) {
                int element = arr[index];
                if (element == target) {
                    return index;

                }

            }
        return -1;

        }

    }



