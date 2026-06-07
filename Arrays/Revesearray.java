import java.util.*;

public class Revesearray {
    public static void main(String[] args) {

      System.out.println("Reverse Array without using another array");
      System.out.println("Enter the size of array:");
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      System.out.println("Enter array values:");
      int[] arr=new int[n];
      for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
      }
      int left=0;
      int right=n-1;

      while(left<right){
        int temp=arr[left];
        arr[left]=arr[right];
        arr[right]=temp;
        left++;
        right--;
      }

      for(int i=0;i<n;i++){
        System.out.println(arr[i]);
      }
    }
}