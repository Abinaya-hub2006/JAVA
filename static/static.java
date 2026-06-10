import java.util.*;

class Employee {

    String name;
    static String company = "Google";

    Employee(String name) {
        this.name = name;
    }

    void display() {

        System.out.println("Name = " + name);
        System.out.println("Company = " + company);

    }
}

public class Main {

    public static void main(String[] args) {

        Employee e1 = new Employee("Abinaya");
        Employee e2 = new Employee("Ravi");

        e1.display();
        e2.display();

    }
}