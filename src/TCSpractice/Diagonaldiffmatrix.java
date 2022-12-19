package TCSpractice;

public class Diagonaldiffmatrix {
    public static void main(String[] args) {
        int sumr = 0, suml = 0, diff = 0;
        int arr[][] = {{1, 2, 3},
                       {4, 5, 6},
                      {7, 8, 14}
        };
        for (int i = 0; i <=2; i++)
        {
            for (int j = 0; j <= 2; j++)
            {
              if (i == j){
                  suml = suml+ arr[i][j];
             }
                  if (i + j ==3-1)
                  sumr = sumr+ arr[i][j];

            }


        }
        System.out.println(diff =suml - sumr);

    }
}




