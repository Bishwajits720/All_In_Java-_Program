package StringPractice;

import java.util.*;


public class dublicateString {
    public static void main(String[] args) {

        String str = "aaabbcccdddaeeff";
        sol(str);

    }

    public static void sol(String str){

        ArrayList<Set<Character>> a=  new ArrayList<>();
        HashMap<Character , Integer> h = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            if (h.containsKey(str.charAt(i))){

                h.put(str.charAt(i) , h.get(str.charAt(i))+1);
            }else {
                h.put(str.charAt(i) , 1);
            }

            }
        System.out.println(a.add(h.keySet()));
        System.out.println(a);

        }

    }



