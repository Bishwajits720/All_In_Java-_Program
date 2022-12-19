package recursion;

public class factorial {
    public static void main(String[] args) {
     int ans = sum(12);
        System.out.println(ans);

    }
    static int fat(int n){
    if (n == 1){
        return 1;
    }
        return n * fat( n-1);
    }


    static int sum(int m){
        if (m == 0){
            return 0;

        }
        return (m/10) + sum(--m);     //formala of the operation
    }
}
