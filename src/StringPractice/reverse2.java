package StringPractice;

public class reverse2 {
    public static void main(String[] args) {

        String str="my name is bishwajit";


        System.out.println(revser3(reverse2(str)));

    }

    static String revser3(String str){

        String revs ="";
        for (int i = str.length() -1; i >=0 ; i--) {

            revs = revs + reverse2(revs);
        }

      return revs;

    }
    static String reverse2(String  str ){

        String rev = "";

        for (int i = str.length()-1 ; i>=0 ; i--){

            rev += str.charAt(i);
        }
        return rev;
    }
}
