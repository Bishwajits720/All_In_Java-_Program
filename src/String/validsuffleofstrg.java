package String;

import java.util.HashMap;

public class validsuffleofstrg {
    public static void main(String[] args) {

        HashMap<Character ,Integer> h = new HashMap<>();
        String str= "abbca";
        for (int i = 0; i < str.length(); i++) {
            if (h.containsKey(str.charAt(i))){
                h.put(str.charAt(i),h.get(str.charAt(i))+1);
            }else {
                h.put(str.charAt(i),1);
            }
        }
        System.out.println(h);
    }
}
