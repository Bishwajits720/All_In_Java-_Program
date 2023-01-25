package Maths.DSA.practice;

public class PalindromeWithOutReverse {
    public static void main(String[] args) throws Exception {

        String str ="madam";
        System.out.println(isPlindrome(str));

    }
    public static Boolean isPlindrome(String str){
        int l = str.length() -1 ;
        Boolean flag = null;
        for (int i = 0,  j =l ; i <=j ; i++ ,j-- ) {
            if (str.charAt(i) == str.charAt(j)){
                flag = true;
                
            }else {
                flag =false;
                break;
            }
        }
     return flag;

    }
}
