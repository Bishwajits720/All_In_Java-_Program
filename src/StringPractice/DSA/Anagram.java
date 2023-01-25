package StringPractice.DSA;
import java.util.*;

public class Anagram {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        checkAnagram(s1,s2);

    }
    static void checkAnagram(String s1 , String s2){

        HashMap<Character , Integer> h = new HashMap<>();
        for (int i = 0; i <s1.length() ; i++) {
            if (h.containsKey(s1.charAt(i))){
                h.put(s1.charAt(i) , h.get(s1.charAt(i)) +1);
            }else {
                h.put(s1.charAt(i) , 1);
            }
        }

        for (int i = 0; i <s2.length() ; i++) {
            if (h.containsKey(s2.charAt(i))){
               h.put(s2.charAt(i) , h.get(s2.charAt(i)) -1);
            }
        }
        for(Map.Entry<Character, Integer> e : h.entrySet()){
            if (e.getValue() >0){
                System.out.println(" not anagram");
                break;
            }else {
                System.out.println("anagram");
                break;
            }
        }

    }
}
