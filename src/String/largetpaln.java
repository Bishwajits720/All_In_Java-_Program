package String;

import java.util.*;

class sol7{
    public String lon(String str){
        int s =0;
        int e =0;
        for (int i = 0; i <str.length() ; i++) {
            int len1 =longplan(str,i,i);
            int len2 = longplan(str,i,i+1);
            int len= Math.max(len1,len2);
            if (len >e -s ){
                s= i -((len-1)/2);
                e =i +(len/2);

            }

        }

    return str.substring(s,e+1);

    }


    public int longplan(String str,int l,int r){


        while(l>=0 && r<str.length() && str.charAt(l) ==str.charAt(r)){
            l--;
            r++;
        }
        return r -l -1;

    }
}



public class largetpaln {
    public static void main(String[] args) {
        sol7 s = new sol7();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        System.out.println(s.lon(str));
    }
}
