package String;

class sol1 {
    public boolean capital(String word) {
        if (word.length() == 0) return true;
        int count = 0;
        int len = word.length();
        for (int i = 0; i < len; i++) {
            int ch = word.charAt(i);
            if (ch >= 65 & ch < 91)
                count++;
        }
        if (count == len) return true;
        if (count == 0) return true;
        if (count == 1 && word.charAt(0) >= 65 && word.charAt(0) < 91)
            return true;
        return false;
    }

}


public class detectCaptical520 {
    public static void main(String[] args) {
    sol1 s =new sol1();
        System.out.println(s.capital("BISHWAJIT"));



    }
  }


