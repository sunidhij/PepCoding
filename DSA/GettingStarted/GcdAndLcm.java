import java.util.*;
    
    public class Main{
    
    public static void main(String[] args) {
      // write your code here
       Scanner scn = new Scanner(System.in);
      int n1 = scn.nextInt();
      int n2 = scn.nextInt();
      
      //GCD
      int m = n1;
      int n = n2;
      while (m!= n)
      { 
          if ( m>n)
          {
              m = m-n;
          }
          else {
              n = n-m;
          }
      }
      System.out.println(m);
      //LCM
      // gcd x lcm = n1 x  n2
      int lcm = (n1*n2)/m;
      System.out.println(lcm);
      
     }
    }
