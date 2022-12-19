package bs.com;


public class searchinstring {
    public static void main(String[] args) {
        String name = "bishwajit";
        char traget = 'i';
        System.out.println(search(name, traget));


    }

    static boolean search(String str, char traget) {

      if (str.length()==0){
          return false;

      }
        for (int i = 0; i < str.length(); i++) {
            if (traget == str.charAt(i)){
                return  true;

            }
        }
        return false;

    }
}


