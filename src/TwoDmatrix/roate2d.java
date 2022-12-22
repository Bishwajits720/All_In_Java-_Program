package TwoDmatrix;

public class roate2d {
    public static void main(String[] args) {
        int arr[][] ={{1,2,3},{4,5,6},{7,8,9}};

        rotate(arr);

    }
    static void rotate(int[][] arr){
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] =temp;

            }
        }
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j < (n/2); j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[i][n-1-j];
                arr[i][n-1-j] =temp;
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] +" ");
            }
            System.out.println();
        }


    }
}
