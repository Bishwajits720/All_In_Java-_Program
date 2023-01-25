package partice.Deloite;

public class palindrome {
    public static void main(String[] args) {

        int num =12021 , rev= 0, rem =0;
        int temp = num;

        while(temp!=0){
            rem = temp %10;
            rev= rev *10 +rem;
            temp = temp/10;
        }
        if (rev == num){
            System.out.println("yes");
        }

    }
}
