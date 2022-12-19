package BSOOP.com;

public class object {
    public static void main(String[] args) {
        student bishwajit = new student();
        System.out.println(bishwajit.rno);
        System.out.println(bishwajit.marks);
        System.out.println(bishwajit.name);

    }
}
class student{
    int rno;
    String name;
    float marks;
}
