package leetcode;

import java.util.Arrays;

public class islandsproblem {
    public static void main(String[] args) {
        char[][] grid = {{'1', '1','0','0','0'}
                ,{'1', '1','0','0','0'},
                {'0','0', '1','0','0'},
                {'0','0','0','1','1'}};
        System.out.println(island(grid));
    }
    static int island(char[][] grid){
        int c =0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == '1'){
                    c++;
                    callbfs(grid,i,j);
                }

            }
        }
        return c;
    }
    static void callbfs(char[][] grid , int i, int j){
        if (i<0 || i>= grid.length || j<0 || j>= grid[i].length || grid[i][j] == '0')
    return;
     grid[i][j] ='0';
     callbfs(grid,i+1,j);
    callbfs(grid,i-1,j);
    callbfs(grid,i,j-1);
    callbfs(grid,i,j+1);
    }


}

