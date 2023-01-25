package StringPractice.DSA;

import java.util.*;

public class FirstNonRepatedChar {
    public static void main(String[] args) {
        String str = "ababsbcxba";
        nonrepateing(str);
    }
    static void nonrepateing(String str){

        HashMap<Character ,Integer> h = new HashMap<>();

        for (int i = 0; i <str.length() ; i++) {
            if (h.containsKey(str.charAt(i))){
                h.put(str.charAt(i) , h.get(str.charAt(i))+1 );
            }else {
                h.put(str.charAt(i) , 1);
            }
        }
        for(Map.Entry<Character , Integer> e :h.entrySet()) {
              if (e.getValue() ==1){
                  System.out.println(e.getKey());
                  break;
              }

        }
    }
}
