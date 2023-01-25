package Maths.DSA;

import java.util.*;

public class highestFrequency {
    public static void main(String[] args) throws Exception {
        String str = "bishjhajdhad";
        maxfrechar(str);

    }
    static void maxfrechar(String str){

        HashMap<Character , Integer> h = new HashMap<>();

        for (int i = 0; i <str.length() ; i++) {
            if (h.containsKey(str.charAt(i))){
                h.put(str.charAt(i) , h.get(str.charAt(i))+1);

            }else {
                h.put(str.charAt(i) , 1 );
            }

        }
        char mf = str.charAt(0);
        for (Character key :h.keySet()){
           if (h.get(key) > h.get(mf)){
               mf = key;
           }
        }

        System.out.println(mf);
    }
}
