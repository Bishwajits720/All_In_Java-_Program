package recursion;

public class recursion1 {
    public static void main(String[] args) {
        numbers(1);

    }
    static void numbers(int i){
        //cond
        if (i == 6){
            System.out.println();
            return;
        }

        System.out.println(i);
        numbers(i+1);
    }
}
