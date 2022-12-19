package String;

import java.util.*;

class slo5{
    public boolean rot(String s1 , String s2){
        if (s1.length() !=s2.length()){
            return false;
        }
       String s3 =s1 +s2;
        if (s3.contains(s2)){
            return true;
        }

     return false;

    }

}

public class rotation {
    public static void main(String[] args){
        slo5 s =new slo5();
        String s1="assalaa";
        String s2 ="salaase";
        System.out.println(s.rot(s1,s2));

    }
}
