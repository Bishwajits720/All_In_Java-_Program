package BackTracking;

public class PrintPath {
    public static void main(String[] args) {

        boolean[][]  board = {{true,true,true},
                              {true,false,true},
                              {true,true,true}};

        count1("",board, 0,0);


    }

    static void count1(String p , boolean[][] maze , int r , int c){

     if (r == maze.length - 1 && c== maze[0].length -1){
         System.out.println(p);
         return;
     }

     if (!maze[r][c]){
         return;
     }
        if (r < maze.length -1){
            count1(p+ 'V', maze , r+1, c);
        }

        if (c< maze.length -1){
            count1(p+'H',maze,r,c+1);

        }
        if (r < maze.length-1 && c < maze.length-1){
            count1(p +"D", maze,r+1,c+1);
        }

    }
}
