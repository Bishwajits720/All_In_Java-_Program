package StringPractice.DSA;

import java.util.HashMap;
import java.util.Map;

public class frequencyString {
    public static void main(String[] args) throws Exception {
        String str = "manajiitpradhaan";
        freq(str);


    }
    static void freq(String str){
        HashMap<Character , Integer> h  = new HashMap<>();

        for (int i = 0; i <str.length() ; i++) {
            if (h.containsKey(str.charAt(i))){
                h.put(str.charAt(i) , h.get(str.charAt(i)) +1);
            }else {
                h.put(str.charAt(i) , 1);
            }
        }
        for (Map.Entry<Character, Integer> e :h.entrySet()){
            if (e.getValue() >0 ){
                System.out.print(e.getKey());
            }
        }



    }
}
