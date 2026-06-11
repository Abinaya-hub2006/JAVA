import java.util.*;
class Bank{
  static final String BANK_NAME = "SBI";

  void display(){
    System.out.println(BANK_NAME);
  }
}
public class Main {
    public static void main(String[] args) {

      Bank b=new Bank();

      b.display();
      b.BANK_NAME="HDFC"; //gives error as it cannotbe changed
      System.out.println(b.BANK_NAME);

    }
}