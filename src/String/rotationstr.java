package String;

import java.util.Arrays;

class sol6{
    public char[] rot(String str, int k){

        char ch[] =str.toCharArray();
         k= k% ch.length;
         int n = ch.length;
         rev(ch,0,n-1);
         rev(ch,0,k-1);
         rev(ch,k,n-1);


        return ch;
    }

    public void rev(char[] ch, int i,int j) {
        while (i<j){
            char temp = ch[i];
            ch[i]=ch[j];
            ch[j] =temp;
            i++;
            j--;
        }
    }

   public String left(String str ,int k){
        String str1 = str.substring(k) +str.substring(0,k);
                      //code              //de
        return str1;
    }

    public String right (String str , int k){
        int p =str.length() -k;

        String str1 = str.substring(p) +str.substring(0,p);

        return str1;


    }

}

public class rotationstr {
    public static void main(String[] args) {
        sol6 s =new sol6();
        String str="decode";
       // System.out.println(Arrays.toString(s.rot(str,2)));
        System.out.println(s.left(str,2));
        System.out.println(s.right(str,2));

    }
}
