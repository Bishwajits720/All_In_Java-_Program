package String;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class BuddyStrings {
    public static void main(String args[]){

        String a = "abcg";
        String b = "bagc";
        System.out.println(buddystring(a,b));

    }
    static boolean buddystring(String a, String b){

        if (a.length() != b.length())  return false;

        if (a.equals(b)){
            HashSet<Character> uniqe = new HashSet<>();
            for (char c :a.toCharArray()){
                uniqe.add(c);
            }
            if (uniqe.size() <a.length()){
                return true;
            }else {
                return false;
            }
        }

        List<Integer> diff =  new ArrayList<>();
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i)){
                diff.add(i);
            }
        }
        if (diff.size() ==2 && a.charAt(diff.get(0)) ==b.charAt(diff.get(1))
        && b.charAt(diff.get(0)) ==a.charAt(diff.get(1))){
            return true;
        }else {
            return false;
        }

    }

}
