import java.util.*;
class Student{
  
  private double cgpa;

  public void setcgpa(double cgpa){
    if(cgpa>=0&&cgpa<=10){
      this.cgpa=cgpa;
    }
  }
  public double getcgpa(){
    return this.cgpa;
  }
}
public class Main {
    public static void main(String[] args) {

      Student s=new Student();
      s.setcgpa(8.88);

      System.out.println(s.getcgpa());
    }
}