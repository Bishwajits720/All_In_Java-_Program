package StringPractice.DSA;

public class reverseString1 {
    public static void main(String[] args) throws Exception{

        String str ="my name is bishwajit sahu";
        revesse(str);

    }
    static void revesse(String str){

        String words[] =str.split(" ");
        String rev = "";

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            String revWord ="";

            for (int j = word.length()-1; j >=0 ; j--) {

                revWord = revWord + word.charAt(j);
                
            }
            rev = rev + revWord +" ";
        }
       System.out.println(rev);

    }
}
