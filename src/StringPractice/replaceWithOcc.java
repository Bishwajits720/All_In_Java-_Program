package StringPractice;

public class replaceWithOcc {
    public static void main(String[] args) {

      String str = "bishwajit";
      char ch = 'i';
      int temp = 1;

      if(str.indexOf(ch) == -1){
          System.out.println("not available");
          System.exit(0);
      }

      char[] arr = str.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == ch){
             arr[i] = String.valueOf(temp).charAt(0);
             temp++;
            }
        }
        System.out.println(arr);

    }
}
