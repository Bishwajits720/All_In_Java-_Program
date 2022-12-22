package arrayspractice;


import java.util.HashMap;
import java.util.Map;

class hash{
    public void searh(){

        HashMap<String , Integer> h = new HashMap<>();

        h.put("bis " , 1);
        h.put("dsd" , 2 );
        h.put("saa" , 3);
        h.put("wqw" , 4);
        h.put("zxc" , 5);

        for(Map.Entry<String , Integer> e : h.entrySet()){
            if (e.getValue() >=3){
                System.out.println(e.getKey());
            }

        }


    }


}



public class Hashmap1 {
    public static void main(String[] args) {
        hash h  = new hash();
        h.searh();
    }
}
