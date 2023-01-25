package String;

import java.util.*;

class sol5{
    public void dublicate(String str){

        char[] ch = str.toCharArray();
        // str in array
         int c = 0;
        Arrays.sort(ch);
        for (int i = 1; i <ch.length-1 ; i++) {
            for (int j = i+1; j <ch.length-1 ; j++) {
                if (ch[i] == 'b'){


                }
            }
        }
            System.out.println(c);
        }
    public void dubmap(String str){

        HashMap<Character,Integer> m = new HashMap<>();

        for (int i = 0; i <str.length() ; i++) {
            if (m.containsKey(str.charAt(i))){
                m.put(str.charAt(i),m.get(str.charAt(i)) +1);
            }else {
                m.put(str.charAt(i) ,1);
            }

        }
        System.out.println(m);



    }
}

public class dublicate2 {
    public static void main(String[] args){

        sol5 s = new sol5();
        String str="babbar";
//        Scanner sc =  new Scanner(System.in);
//        System.out.println("enter the value");
//        String str = sc.next();
        s.dubmap(str);

    }
}
