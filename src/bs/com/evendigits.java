package bs.com;

public class evendigits {
    public static void main(String[] args) {
        int[] nums = {12, 32,};
        //System.out.println(findnumbers(nums));
        System.out.println(digits(0));

    }

    static int findnumbers(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (even(num)) {
                count++;
            }
        }
        return count;

    }

    static boolean even(int num) {
        int noofdigits = digits(num);
        return noofdigits % 2 == 0;

    }

    static int digits(int num) {


        if (num<0){
            num = num *-1;
        }

        if (num == 0){
            return 1;

        }
        int count = 0;

        while (num > 0) {
            count++;
            num = num / 10;  //n /=10

        }

       return count;
    }

}