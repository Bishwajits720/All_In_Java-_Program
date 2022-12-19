package String;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class dublicatekey {
    // store the frequency in hashmap
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the value");
        String str =sc.next();
        dup(str);

    }
    static void dup(String str){
        Map<Character,Integer> m = new HashMap<>();
        char []  ca = str.toCharArray();
        for (char c:ca){
            if (m.containsKey(c)){
                m.put(c,m.get(c) +1);
            }
            else m.put(c,1);
        }
        for (Map.Entry<Character,Integer> e:m.entrySet()){
            if (e.getValue()>1)
                System.out.println(e.getKey()+ " :"+ e.getValue());
        }
    }
}
