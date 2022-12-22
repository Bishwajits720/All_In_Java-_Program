package arrayspractice;

public class maxSubarray {
    public static void main(String[] args) {
        int arr[] = {-2,1,-3,4,-1,2,1,-5,4};
        int ans =maxsub(arr);
        System.out.println(ans);
    }
    static int maxsub(int arr[]) {

        int max = 0;
        int curr = 0;

        for (int i = 0; i < arr.length; i++) {
            curr = Math.max(arr[i], curr + arr[i]);
            max = Math.max(max, curr);

        }
     return max;
    }
}
