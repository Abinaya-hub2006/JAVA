import java.util.*;

public class Switchcase {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.print("Enter a number:");
      int n=sc.nextInt();
      switch(n){
        case 1:
          System.out.println("This is cool");
          break;
        case 2:
          System.out.println("You are awesome");
          break;

        default:
          System.out.println("Good");
      }
    }
}