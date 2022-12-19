package BSOOP.com;

 class student1 {
     int studentid;
     String name;
     String city;

     public void study(){

         System.out.println(name + "is studing");
     }

     public void ShowfullDetails(){
         System.out.println("my  name is  " + name);
     }

     public student1(int stud){

         System.out.println("constructor");
     }
 }

public class main1{
    public static void main(String[] args) {
        //objects

        student1 std = new student1(20);
        std.name="bishwajit";
        std.studentid=111;
        std.city= "rourkela";

        std.study();
        std.ShowfullDetails();


    }
}
