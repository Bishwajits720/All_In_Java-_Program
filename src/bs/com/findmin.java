package bs.com;

public class findmin {
    public static void main(String[] args) {
        int[] arr={12,34,9,564,64,544,54};
        System.out.println(min(arr));
    }
    static int min(int[] arr){
        int ans = arr[0];
        for (int i = 1; i <arr.length; i++) {
            if(arr[i]< ans){
                ans= arr[i];

            }
        }
        return ans;
    }
}
