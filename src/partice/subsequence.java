package partice;

import java.util.*;

public class subsequence {
    public static void main(String[] args) {

      ArrayList<String> al =subsequence("","abc");
      search(al);



    }
    static ArrayList<String> subsequence( String p , String up ){



        if (up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;

        }

        char ch = up.charAt(0);

    ArrayList<String> l  = subsequence(p+ch,up.substring(1));
    ArrayList<String> r =  subsequence(p,up.substring(1));

    l.addAll(r);
    return l;
    }

    static void search(ArrayList<String> list){

        for (int i = 0; i <list.size() ; i++) {
            if (list.get(i).length() == 2){
                System.out.println(list.get(i));

            }
        }


    }

}
