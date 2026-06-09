import java.util.*;
class Employee{
  String name;
  int salary;
  Employee(String n,int s){
    this.name=n;
    this.salary=s;
  }

  void display(){
    System.out.println("Name="+this.name);
    System.out.println("Salary="+this.salary);
  }
}
public class classexample {
    public static void main(String[] args) {
      Employee e=new Employee("Abinaya",100000);

      

      e.display();
    }
}