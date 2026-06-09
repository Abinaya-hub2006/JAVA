import java.util.*;
class Employee{
  String name;
  int salary;

  void display(){
    System.out.println("Name="+name);
    System.out.println("Salary="+salary);
  }
}
public class classexample {
    public static void main(String[] args) {
      Employee e=new Employee();

      e.name="Abinaya";
      e.salary=100000;

      e.display();
    }
}