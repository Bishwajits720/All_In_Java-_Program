package String;

class sol{
    public boolean ispalin(String s){
        if ( s== null){
            return false;
        }
        int l =0;
        int r = s.length() -1;
        while(l<r){
            if (!isalpha(s.charAt(l))){
                l++;
            } else if (!isalpha(s.charAt(r))) {
                r--;
            } else if (lower(s.charAt(l)) != lower(s.charAt(r))) {
                return false;
            }else {
                l++;
                r--;
            }
        }

     return true;

    }
    private boolean isalpha(char c){
      return ('a' <=c && c <= 'z') || ('A' <=c && c <= 'Z') ||('0' <=c && c <= '9');
    }
    private char lower(char c){

        if (('a' <=c && c<= 'z') || ('0' <=c && c<= '9')) return c;

         return (char) ((int)c+32);

    }
}


public class palindrome {
    public static void main(String[] args) {
        sol s =new sol();
        System.out.println(s.ispalin("my name is si emaNym"));
    }
}
