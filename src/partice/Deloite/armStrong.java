package partice.Deloite;

public class armStrong {
    public static void main(String[] args) {

        int num = 153 , rem =0 , arm =0;
        int temp = num;

        while(num>0){
            rem = num %10;
            arm = (rem * rem *rem ) +arm;
            num = num /10;
        }
        if (temp ==arm){
            System.out.println(arm);
        }

    }
}
