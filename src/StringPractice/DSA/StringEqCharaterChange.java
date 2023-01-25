package StringPractice.DSA;

import java.util.HashMap;
import java.util.Map;

public class StringEqCharaterChange {
    public static void main(String[] args) {

        String str1 ="biswa";
        String str2 = "awbid";
        check(str1 , str2);

    }
    static void check(String str1 , String str2){
        Map<Character , Integer> m = new HashMap<>();

        for (int i = 0; i <str1.length() ; i++) {
            if (m.containsKey(str1.charAt(i))){
                m.put(str1.charAt(i) , m.get(str1.charAt(i)) +1);
            }else {
                m.put(str1.charAt(i) , 1);
            }

        }

        for (int i = 0; i < str2.length(); i++) {
            if (m.containsKey(str2.charAt(i))){
                m.put(str2.charAt(i) , m.get(str2.charAt(i)) -1);
            }
        }

        for (Map.Entry<Character , Integer> e : m.entrySet()) {
            if (e.getValue() >= 1) {
                System.out.println("not equal");
                break;
            }else {
                System.out.println("equal ");
                break;
            }

        }
    }

}
