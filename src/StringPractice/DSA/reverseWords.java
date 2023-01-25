package StringPractice.DSA;

public class reverseWords {
    public static void main(String[] args) throws Exception {

        String str = "i love to do programming in the class";
        noofwords(str);

    }
    static void reverseWords1(String str){
        String arr[] = str.split(" ");

        for (int i = arr.length-1; i >=0 ; i--) {
            System.out.print(arr[i] +" ");
        }

    }
    static void noofwords(String str){
        String arr[] =str.split(" ");

        System.out.println(arr.length  );

    }
}
