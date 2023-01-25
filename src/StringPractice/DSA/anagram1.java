package StringPractice.DSA;

public class anagram1 {
    public static void main(String[] args) throws Exception {

        String s1 = "aabb";
        String s2 = "beba";
        System.out.println(isAnagram(s1,s2));

    }
    static  Boolean isAnagram(String s1, String s2){
        int c[] = new int[256];

        for (int i = 0; i <s1.length() ; i++) {
            c[s1.charAt(i)]++;
            c[s2.charAt(i)]--;
        }

        for (int i = 0; i < c.length ; i++) {
            if (c[i]!=0){
                return false;
            }

        }
        return true;
    }
}
