package partice;

public class palindrom {
    public static void main(String[] args) {
        int temp = 12321;
        int rev = 0;
       int rem;

        int num =temp;

        // reverse it and compare
        while( num != 0){
            rem  = num % 10;
            rev =rev *10 +rem;
            num = num /10;
        }
        if (temp == rev){
            System.out.println("pla");
        }else {
            System.out.println("not pla");
        }



    }
}
