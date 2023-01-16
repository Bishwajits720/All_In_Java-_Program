package recursion;

import java.util.ArrayList;
class sol22 {
    public ArrayList<String> subset222(String p, String up, ArrayList<String> arr) {

        if (up.isEmpty()) {
            arr.add(p);
            return arr;
        }

        char ch = up.charAt(0);


        subset222(p, up.substring(1), arr);
        subset222(p + ch, up.substring(1), arr);


        return arr;
    }

    public void search(ArrayList<String> arr){
        for (int i = 0; i <arr.size() ; i++) {
            if (arr.contains(arr.get(i))){
                System.out.println(arr.get(i));
            }

        }




    }

}

public class subset2 {
    public static void main(String args[]){

        sol22 s = new sol22();
        ArrayList<String> arr =new ArrayList<>();
        System.out.println(s.subset222("","123",arr));
        s.search(arr);

    }
}
