package bs1.com;

public class matrixoddeven {
    public static void main(String[] args) {
        int arr[][]  ={{1,2,3}
                ,{4,5,6}
                ,{7,8,9}
        };
        odd(arr);
       //System.out.println("odd=" + odd(arr));
        //System.out.println("even=" + );
    }

    static int odd(int[][] arr) {
        int oddcount = 0;
        int evencount = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i][j] % 2 == 0) {

                    oddcount++;

                }
                evencount++;

            }
            System.out.println("odd=" + oddcount);
            System.out.println("even=" + evencount);

        }
        return -1;

    }
}
