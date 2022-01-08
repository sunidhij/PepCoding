import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
      // write your code here
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int a = 0;
      int b= 1;
      int count = 0;
      System.out.println(a);
      System.out.println(b);
      while (count <n-2)
      {
          int c = a+b;
          System.out.println(c);
          a=b;
          b=c;
          count++;
      }
   }
  }
