package StringPractice;

public class count {
    public static void main(String[] args) {

        String str = "aaaabbbccddfefss";
        System.out.println(comp1(str));
        System.out.println(comp2(str));

    }
    static String comp1(String str){
       StringBuilder s = new StringBuilder(String.valueOf(str.charAt(0)));

        for (int i = 1; i <str.length() ; i++) {
            char curr = str.charAt(i);
            char prv = str.charAt(i -1);

            if (curr != prv){
                s.append(curr);
            }

        }


    return s.toString();
    }


    static String comp2(String str){
      String s = str.charAt(0) +"";
        int c = 1;

        for (int i = 1; i <str.length() ; i++) {
            char curr = str.charAt(i);
            char prev = str.charAt(i -1);

            if (curr == prev){
                c++;
            }else {
                if (c >1){
                   s =s +c;
                   c=1;
                }
                s=s+curr;
            }
        }
        if (c>1){
            s =s +c;
            c=1;
        }

        return s;
    }
 }
