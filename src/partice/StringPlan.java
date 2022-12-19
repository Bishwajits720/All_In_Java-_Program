package partice;

public class StringPlan {
    public static void main(String[] args) {
        String s ="arora";
        String c ="";


        for (int i = s.length()-1; i >=0 ; i--) {
            c += s.charAt(i);
        }
        if (s.equals(c)){
            System.out.println("plam");
        }




    }
}
