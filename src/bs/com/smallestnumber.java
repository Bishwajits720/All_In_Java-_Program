package bs.com;

public class smallestnumber {
    public static void main(String[] args) {
        char [] lett= {'f','g', 'i', 'l', 'm'};
        char target = 'a';
        char ans = smallestno(lett , target);
        System.out.println(ans);


    }
    static char smallestno(char [] letters , char target) {


        int start = 0;
        int end = letters.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < letters[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
            }
            return letters[start % letters.length];
        }


    }




