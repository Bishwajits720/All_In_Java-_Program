package BSOOP.com;

public class oops1 {
    public static void main(String[] args) {

        childern bishwajit = new childern();


        System.out.println(bishwajit.marks);
        System.out.println(bishwajit.name);
    }
}
 class childern{
    int marks;
    String name;

   childern(){
       this(18,"bishwa");
   }
     childern(int marks ,String name){
         this.marks = marks;
         this.name = name;
     }

 }











