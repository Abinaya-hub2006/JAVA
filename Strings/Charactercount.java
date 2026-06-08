import java.util.*;

public class Charactercount {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter a string:");
      String s=sc.next();
      HashMap<Character,Integer>map=new HashMap<>();

      for(int i=0;i<s.length();i++){
        char c=s.charAt(i);

        if(map.containsKey(c)){
          map.put(c,map.get(c)+1);
        }else{
          map.put(c,1);
        }
      }
      for(char c:map.keySet()){
        System.out.println(c+"->"+map.get(c));

      }
    }
}