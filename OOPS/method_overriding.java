import java.util.*;
class vehicle{
  void start(){
    System.out.println("Vehicle started");
  }
}
class Car extends vehicle{
  void start(){
    super.start();
    System.out.println("car started");
  }
}
public class Main {
    public static void main(String[] args) {
      //System.out.println("Hello, World!");
      Car c=new Car();

      c.start();
      
    }
}