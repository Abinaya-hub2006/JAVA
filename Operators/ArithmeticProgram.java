import java.util.*;

public class Arithmeticprogram {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.print("num1=");
      int num1=sc.nextInt();
      System.out.print("num2=");
      int num2=sc.nextInt();

      System.out.println("sum="+(num1+num2));
      System.out.println("diff="+(num1-num2));
      System.out.println("mul="+(num1*num2));
      System.out.println("div="+(num1/num2));
      System.out.println("rem="+(num1%num2));
    }
}