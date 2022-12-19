package partice;

class sol4{
    public void reverse(int num){

        //int num=123;
        int rev =0;
        int rem =0;

        while( num !=0){
            rem = num %10;
            rev = rev *10 + rem;
            num = num/10;

        }
        System.out.println(rev);
    }
}


public class reversenNum {
    public static void main(String[] args) {
        sol4 s = new sol4();
        s.reverse(123);

    }
}
