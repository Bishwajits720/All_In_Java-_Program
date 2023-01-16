package String;

import java.util.HashSet;

public class LongestSubstringWithoutRepeat {
    public static void main(String[] args) {
        System.out.println(lengthofLongestSubstring("abcabcdbb"));

    }
    static int lengthofLongestSubstring(String s){

        int i = 0;
        int j = 0;
        int max= 0;

        HashSet<Character> hash_set = new HashSet<>();

        while(j < s.length()){
            if (!hash_set.contains(s.charAt(j))){
                hash_set.add(s.charAt(j));
                j++;
                max= Math.max(hash_set.size() , max);
            }else {
                hash_set.remove(s.charAt(i));
                i++;
            }
        }
      return max;
    }
}
