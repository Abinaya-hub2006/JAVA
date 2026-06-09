import java.util.*;
abstract class Employee {

    abstract void work();
}
class Developer extends Employee {

    @Override
    void work() {
        System.out.println("Developer Coding");
    }
}
class Tester extends Employee {

    @Override
    void work() {
        System.out.println("Tester Testing");
    }
}
public class Main {
    public static void main(String[] args) {
      //System.out.println("Hello, World!");
      Employee e;

      e = new Developer();
      e.work();

      e = new Tester();
      e.work();
    }
}