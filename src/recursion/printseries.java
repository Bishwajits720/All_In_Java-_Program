package recursion;

public class printseries {
    public static void main(String[] args) {
     //   fun(5);
        funboth(5);
    }
    static void fun(int n){
        if (n == 0){
            return;
        }
        System.out.println(n);
        fun(n-1);

    }

    static void funrev(int n){
        if (n == 0){
            return;
        }

        funrev(n-1);
        System.out.println(n);

    }
    static void funboth(int n){
        if (n == 0){
            return;
        }
        System.out.println(n);
        funboth(n-1);
        System.out.println(n);

    }

}
