package String;

import java.util.*;

public class dublicate1 {
    public static void main(String[] args) {

        String str = "programming";

        StringBuilder sb = new StringBuilder();
        Set<Character> set = new LinkedHashSet<>();

        for(int i = 0 ; i<str.length(); i++){
            set.add(str.charAt(i));
        }

        for (Character c :set){
            sb.append(c);
        }
        System.out.println(sb);

    }
}
