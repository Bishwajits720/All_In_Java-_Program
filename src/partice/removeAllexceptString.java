package partice;

public class removeAllexceptString {
    public static void main(String[] args) {
        String s ="$P*r;e..pi,   ns'ta^?";
        removeSpecialChar(s);

    }


    static void removeSpecialChar(String s){
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) <'A' || s.charAt(i) >'Z' && s.charAt(i) < 'a' || s.charAt(i) > 'z'){

                s=s.substring(0,i)+s.substring(i+1);
                i--;

            }
        }
        System.out.println(s);
    }
}
