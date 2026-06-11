import java.util.*;

public class Main {
    public static void main(String[] args) {

      ArrayList<Integer>list=new ArrayList();
      list.add(10);
      list.add(20);
      list.add(30);
      int sum=0;
      System.out.println(list.size());
      for(int i=0;i<list.size();i++){
        sum+=list.get(i);
      }
      System.out.println(sum);
    }
}