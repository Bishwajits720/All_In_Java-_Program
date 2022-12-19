package partice;

import java.util.*;

class sol1{
    public void find(String str){

        HashMap<Character ,Integer> h =new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            if (h.containsKey(str.charAt(i))){
                h.put(str.charAt(i) ,h.get(str.charAt(i))+1);
            }else{
                h.put(str.charAt(i) ,1);
            }
        }
        System.out.println(h);

    }
}

public class DupCharString {
    public static void main(String[] args){

        sol1 sol = new sol1();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string");
        String str = sc.next();
        sol.find(str);

    }
}
