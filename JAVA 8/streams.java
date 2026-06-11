import java.util.*;

public class Main {
    public static void main(String[] args) {
      //System.out.println("Hello, World!");
      List<Integer> list =
        Arrays.asList(
        1,2,3,4,5,6,7,8,9,10
      );
      int sum=list.stream()
        .filter(x->x%2==0)
        .map(x->x*x)
        .reduce(0,(a,b)->a+b);
      System.out.println(sum);
    }
}