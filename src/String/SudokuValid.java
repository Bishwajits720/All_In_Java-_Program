package String;

import java.util.HashSet;

public class SudokuValid {
    public static void main(String[] args) {
        char[][] board =  {  {7, 6, 5 ,8, 4 ,3 ,2, 1, 9},
                {4 ,1 ,2, 6 ,9 ,7 ,8 ,5 ,3 },
                {9 ,3 ,8 ,2 ,5, 1, 7 ,6, 4},
                {3, 2 ,4 ,1 ,8 ,6 ,5 ,9, 7 },
                {1 ,8, 9 ,5 ,7 ,4 ,6 ,3 ,2 },
                {6 ,5 ,7, 9, 3 ,2 ,4 ,8 ,1 },
                {8 ,7 ,1 ,4 ,6, 9 ,3 ,2 ,5},
                {5, 9 ,3 ,7, 2, 8 ,1 ,4, 6},
                {2 ,4 ,6, 3 ,1, 5 ,9, 7 ,8}
        };

        System.out.println(isValidSudoku(board));


    }
    static boolean isValidSudoku(char[][] board){


        HashSet<String> seen = new HashSet<>();
        for (int i = 0; i < 9; i++) {
         //   HashSet<Integer> row_vals = new HashSet<>();


            for (int j = 0; j < 9; j++) {
                char curr_val = board[i][j];
                 if (curr_val !='.'){
                     if (!seen.add(curr_val + "found in row" + i)
                     || !seen.add(curr_val + "found in col" + j)
                     || !seen.add(curr_val + "found in sub boxs" + i/3 + "-" + j/3))

                      return false;
                 }

            }
        }


     return true;
    }
}
