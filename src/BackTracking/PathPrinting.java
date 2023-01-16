package BackTracking;

public class PathPrinting {
    public static void main(String[] args) {
      // path("" , 3,3);
       diagonalPath("",3,3);

    }
    static void path(String p , int r , int c){

        if (r == 1 && c ==1){
            System.out.println(p);
            return;
        }

       if (r >1){
           path(p+'D',r-1,c);
       }

       if (c>1){
           path(p +'R', r ,c-1 );
       }

      }
      static void diagonalPath(String p , int r , int c){

        if (r ==1 && c==1){
            System.out.println(p);
            return;
        }

     if (r==2 && c ==2){
         return;
     }

     if (r >1 ){
         diagonalPath(p+ 'V' , r-1,c);
     }

     if (c>1){
         diagonalPath(p+ 'H' , r ,c-1);
     }

     if (r >1 && c>1){
         diagonalPath(p+'D',r-1,c-1);
     }



    }

}
