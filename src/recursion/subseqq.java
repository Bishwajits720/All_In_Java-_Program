package recursion;

public class subseqq {
    public static void main(String[] args) {
        String p ="";
          sub(p,"abc");
          search(sub(p,"abc"));
    }
    static String sub(String p , String up){

        if (up.isEmpty()){
            System.out.println(p);
            return p;
        }

        char ch = up.charAt(0);

        sub(p+ch,up.substring(1));
        sub(p,up.substring(1));

        return p;
    }

    static void search(String str){
       if (str.length() >2){
           System.out.println(str.length() >2);
       }

    }

}
