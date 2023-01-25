package StringPractice;

import java.util.HashMap;
import java.util.Map;

public class newww {
    public static void main(String[] args) {

        String str = "abasbabsbas";

        HashMap<Character , Integer> m = new HashMap<>();

        for(int i = 0 ; i <str.length() ; i++){
            if (m.containsKey(str.charAt(i))){
                m.put(str.charAt(i),m.get(str.charAt(i))+1);
            }else{
                m.put(str.charAt(i) , 1);
            }
        }

        for (Map.Entry<Character , Integer> e : m . entrySet()){
            if (e.getValue() >1){
                System.out.println(e.getKey());
            }
        }


    }
}
