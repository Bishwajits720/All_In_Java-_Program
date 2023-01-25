package StringPractice;

public class captialToSmall {
    //lower case = 'a' + upper case -'A';
    //upser case = 'A' + lower case - 'a';

    public static void main(String[] args) {
        String str ="BaBa";
        System.out.println(ToggleCase(str));


    }
    public static StringBuilder ToggleCase(String  str){
        StringBuilder sb  = new StringBuilder(str);
        for (int i = 0; i <sb.length() ; i++) {

            char ch = sb.charAt(i);

            if (ch >= 'a' && ch <= 'z'){
               char up = (char)('A' + ch - 'a');
               sb.setCharAt(i , up);

            }else if(ch >= 'A' && ch <= 'Z'){

                char dow= (char)('a' + ch -'A');
                sb.setCharAt(i , dow);

            }
        }
        return sb;
    }

 }
