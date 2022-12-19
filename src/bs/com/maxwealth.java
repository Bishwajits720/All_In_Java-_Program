package bs.com;

public class maxwealth {
    public static void main(String[] args) {
        int[][] arr = {
                {23, 4, 1},
               // {12, 45, 2,}
        };
        System.out.println(maxinumweath(arr));
    }

    public static int maxinumweath(int[][] accounts) {

        int ans= Integer.MIN_VALUE;
        for (int[] account : accounts) {
            int sum = 0;
            for (int i : account) {
                sum += i;


            }
        if (sum > ans) {
            ans = sum;
        }
    }
    return ans;
   }

}
