package partice.Deloite;

public class fibbonaci {
    public static void main(String[] args) {

        int num = 15;
         int a= 0 , b = 1;
        System.out.print(a + "," +b +",");
        int next;

         for (int i = 2 ; i <= num; i++){
             next =a+b;
             a =b;
             b = next;
             System.out.print(next + ",");
         }
    }
}
