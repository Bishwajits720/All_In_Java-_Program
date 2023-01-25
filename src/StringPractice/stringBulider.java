package StringPractice;

public class stringBulider {
    public static void main(String[] args) {

        StringBuilder s = new StringBuilder("hello");
        System.out.println(s);

        s.setCharAt(0,'d');

        s.insert(2,'y');
        System.out.println(s);//(index , element);

        s.delete(0,1);  //(start index , ending index);
        System.out.println(s);

        //add last
        s.append('t');
        System.out.println(s);
    }
}
