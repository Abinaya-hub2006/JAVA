import java.util.*;

public class  Main{
  public static void main(String[] args){
    //This is single line comment
    /* multiline 
    comment*/

  int ans=0;
  System.out.println("Hello world!");

  Scanner sc=new Scanner(System.in);
  System.out.print("What is your name:");
  String name=sc.next();

  System.out.print("Age:");
  int Age=sc.nextInt();

  System.out.print("CGPA:");
  double cgpa=sc.nextDouble();

  System.out.println("Name= "+ name);
  System.out.println("Age= "+ Age);
  System.out.println("CGPA= "+ cgpa);
  }
}