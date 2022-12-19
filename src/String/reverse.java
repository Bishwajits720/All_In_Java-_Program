package String;

public class reverse {
    public static void main(String[] args) {

        String str="bishwajit my";
        //System.out.println(reverse(str));
        System.out.println(reverse1(str));

    }

    static String reverse(String str){

        StringBuilder sb =new StringBuilder(str);
          sb.reverse();
          return sb.toString();
    }

    static String reverse1(String str){

        char ch[] =str.toCharArray();
        // convert the string in toCharArray() for operation
         String rev=" ";

        for (int i = ch.length -1; i >=0  ; i--) {
            rev  += ch[i];
        }
        return rev;

    }
}
