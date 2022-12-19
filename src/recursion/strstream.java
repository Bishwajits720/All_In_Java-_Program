package recursion;

public class strstream {
    public static void main(String[] args) {
        //System.out.println(skip1("baccdah"));
        System.out.println(apple("sabdjapplesdasda"));
    }
    static void skip(String p,String up){

        if (up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch= up.charAt(0);

        if (ch=='a' || ch=='d'){
            skip(p,up.substring(1));

        }else {
            skip(p+ch,up.substring(1));
        }


    }

    static  String skip1(String up){

        if(up.isEmpty()){
            return "";
        }

        char ch = up.charAt(0);

        if (ch == 'a'){
            return skip1(up.substring(1));
        }else {
            return ch +skip1(up.substring(1));

        }
    }

    static String apple(String up){
        if(up.isEmpty()){
            return "";
        }
    if(up.startsWith("apple")){
        return apple(up.substring(5));
    }else {
        return up.charAt(0) +apple(up.substring(1));
    }






    }
}
