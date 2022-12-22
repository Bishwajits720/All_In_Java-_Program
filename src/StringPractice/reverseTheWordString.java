package StringPractice;

public class reverseTheWordString {
    public static void main(String[] args) {

         String str ="my name is bishwajit sahu";
        System.out.println(reverse1(str));


    }
    static String reverse1(String str){

        String words[] = str.split("\\s");

        String revs ="";

        for (int i = 0; i <words.length ; i++) {
            String word = words[i];
            String revw ="";
            for (int j =word.length()-1 ; j>=0 ;j--){
              revw =revw +word.charAt(j);

            }
            revs = revs +revw + " ";
        }


    return revs;
    }
}
