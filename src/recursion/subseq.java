package recursion;

import java.util.ArrayList;

public class subseq {
    public static void main(String[] args) {
        //subseqq("","abc");
        System.out.println(subsewarr("","abc"));

    }
    static  void subseqq(String p ,String up){

        if (up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch =up.charAt(0);

        subseqq(p+ch,up.substring(1));
        subseqq(p,up.substring(1));



    }


    static ArrayList<String> subsewarr(String p ,String up){

        if ((up.isEmpty())){
            ArrayList<String> list =new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch =up.charAt(0);

        ArrayList<String> left =subsewarr(p+ch,up.substring(1));
        ArrayList<String> right =subsewarr(p,up.substring(1));

        left.addAll(right);
        return left;



    }
}
