package recursion;

class sol{
    public int solve(long nStaris , int i){

        if ( i == nStaris)
            return 1;
        if (i >nStaris)
            return 0;
        return (solve(nStaris,i+1) +solve(nStaris, i+2)) ;
    }
}



public class stairs70 {
    public static void main(String[] args) {
        sol s = new sol();
        System.out.println(s.solve(6,0));
    }


}
