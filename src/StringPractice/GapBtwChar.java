package StringPractice;

public class GapBtwChar {
    public static void main(String[] args) {
        String str ="hjafsv";
        System.out.println(sol1(str));


    }
    public static StringBuilder sol1(String  str){

        StringBuilder sb = new StringBuilder();

        sb.append(str.charAt(0));

        for (int i = 1; i <str.length()  ; i++) {
            char ch1 = str.charAt(i);
            char ch2 = str.charAt(i-1);
            int gap = ch1 - ch2;

            sb.append(gap);
            sb.append(ch1);

        }
        return sb;
    }
}
