package String;


// max subString sliding window
//s =ABAB   , k =2
//  AAAA     output = 4

//s2 = AABABBA  k = 1
// AAAABBA    output =4

public class longRepeatingCharReplacement {
    public static void main(String[] args) {
        String s = "AABABBA";
        int k =1;
        System.out.println(charaReplacement(s,k));


    }
    static int charaReplacement(String s , int k){
         int N= s.length();
         int[] char_count = new int[26];


         int window_start= 0;
         int max_lenght =0;
         int max_count=0;

         for (int window_end =0 ; window_end <N ;window_end++){
             char_count[s.charAt(window_end) - 'A']++;
             int current_char_count =char_count[s.charAt(window_end) - 'A'];
             max_count= Math.max(max_count , current_char_count);

             while(window_end -window_start -max_count +1 >k){
                 char_count[s.charAt(window_start) - 'A']--;
                 window_start++;
             }
             max_lenght= Math.max(max_lenght ,window_end-window_start +1);
         }
         return max_lenght;


    }
}
