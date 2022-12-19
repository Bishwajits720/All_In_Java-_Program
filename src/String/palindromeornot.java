package String;

public class palindromeornot {
    public static void main(String[] args) {

        String str ="abccba";

        System.out.println(isPaln(str,0,str.length()-1));


    }
    static  boolean isPaln(String str, int i, int j){

        if (i ==j){
            return true;
        }
        if (str.charAt(i) != str.charAt(j)){
            return false;
        }

        if (i<j+1){
            return isPaln(str,i+1,j-1);
        }
        return true;
    }
}
