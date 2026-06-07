import java.util.*;

public class Loops {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);

      do{
        System.out.print("Enter a number:");
        int n=sc.nextInt();
        switch(n){
          case 1:
            System.out.println("Multiplication table!! Enter a number:");
            int a=sc.nextInt();
            for(int i=0;i<=8;i++){
              System.out.println(a+"*"+i+"="+(a*i));
            }
            break;
          case 2:
            System.out.println("Sum of N !! Enter a number:");
            int b=sc.nextInt();
            int sum=0;
            while(b!=0){
              sum+=b;
              b--;
            }
            System.out.println("sum="+sum);


            break;
          case 3:
            System.out.println("Patter Printing!! Enter a number:");
            int c=sc.nextInt();
            for(int i=1;i<=c;i++){
              for(int j=1;j<=i;j++){
                 if(i==4){
                continue;
              }
              System.out.print("X");

              }
              System.out.println();
             
              
            }
        }
      }while(true);
    
    }
}