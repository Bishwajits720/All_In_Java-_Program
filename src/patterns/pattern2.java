package patterns;

public class pattern2 {
    public static void main(String[] args) {

        //no of lines  = no of rows = no of times outer loop work
        // for every row number => how many cols are there
       pattern1(4);

    }
    static void pattern1(int n){

        for (int i = 1; i <=n ; i++) {

            for (int j = 1; j <=i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
