import java.util.*;
    
    public class Main{
    
    public static void main(String[] args) {
      // write your code here
      Scanner scn = new Scanner(System.in);
      int n= scn.nextInt();
       int m = n;
       int p = 1;
       while (m >= 10)
       {
         m = m/10;
         p = p*10;
       }
        
      //displaying digits
      while (p != 0)
      {
        int dig = n/p;
        System.out.println(dig);
        n= n%p;
        p = p/10;
      }
     }
    }
