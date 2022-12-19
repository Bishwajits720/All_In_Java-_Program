package BSOOP.com;

class Employee {
    int salary;
    String name;

    public int getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }
}

public class Q1_Employee {
    public static void main(String[] args) {
        Employee obj = new Employee();
        obj.setName("Praveen");
        obj.salary = 50000;
        System.out.println(obj.getName());
        System.out.println(obj.getSalary());
    }
}