package StringPractice.DSA;

public class findNoWords {
    public static void main(String[] args) {

        String str ="hello world";

        char ch[] = str.toCharArray();

        for (int i = 0; i < ch.length; i++) {
            String s ="";

            while(i<ch.length && ch[i] !=' '){
                s += ch[i];
                i++;
            }
            if (s.length()>0){
                System.out.println(s + "=>" + s.length());
            }
        }
    }
}
