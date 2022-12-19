package bs1.com;

     public class oddEven {
        public static void main(String[] args) {
            int rows, cols, countOdd = 0, countEven = 0;
            int a[][] = {
                    {1, 2, 7, 3},
                    {6, 5, 11,2},
                    {8, 2, 6, 18},
                    {11,13,90,41}
            };


            for(int i = 0; i < a.length; i++){
                for(int j = 0; j < a[0].length; j++){
                    if(a[i][j] % 2 == 0)
                        countEven++;
                    else
                        countOdd++;
                }
            }

            System.out.println(" odd numbers: " + countOdd);
            System.out.println(" even numbers: " + countEven);
        }
    }

