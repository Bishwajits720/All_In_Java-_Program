package String;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class wordsubSet {
    public static void main(String[] args) {
        String[] A ={"facebook" , "leetcode" , "google" , "amazon"};
        String[] B= {"g" ,"o"};

        System.out.println(wordSubset(A,B));

    }
    static List<String> wordSubset(String[] A, String[] B){
        List<String> result = new ArrayList<>();

        int[] max_b_frequencies = new int[26];

        for (int i = 0; i <B.length ; i++) {
            String current_word = B[i];
            int[] char_frequencies = get_char_frequency(current_word);

            for (int j = 0; j <26 ; j++) {
                max_b_frequencies[j] = Math.max(max_b_frequencies[j],char_frequencies[j] );

            }
        }
        for (int i = 0; i <A.length ; i++) {
            String current_word = A[i];
            int[] char_counts = get_char_frequency(current_word);

            boolean valid = true;
            for (int j = 0; j <26 ; j++) {
                if (max_b_frequencies[j] > char_counts[j]){
                    valid = false;
                    break;
                }
            }
            if (valid) result.add(current_word);
        }
        return result;

    }
    public static int[] get_char_frequency(String S){
        int[] result = new int[26];
        for(char c : S.toCharArray()){
            result[c- 'a']++;

        }
        return result;
    }
}


//A ={"facebook" , "leetcode" , "google" , "amazon"};
//B= {"g" ,"o"};
// b_frequency =[0,0,0,0,1,0,0,0,0,0,0,0,0,1,0]   make a frequency table
// a_frequency= [1,2,3,4,2,3,4,4,2,3,424,42,3,3]