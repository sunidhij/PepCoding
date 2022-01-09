import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
    
      /* Logic Explanation - a number n is not a prime, it can be factored into two factors a and b:
          n = a * b
         Now a and b can't be both greater than the square root of n, since then the product a * b would be greater than sqrt(n) * sqrt(n) = n. So in any factorization of n, at least one of the factors must be smaller than the square root of n, and if we can't find any factors less than or equal to the square root, n must be a prime.
*/
  
       // write ur code here
       int t =scn.nextInt();
       for (int i = 0; i<t;i++)
           {
               int n = scn.nextInt();
              int count =0;
              for ( int k = 2; k*k<= n; k++)
              {
                  if (n%k==0)
                  {
                      count = count+1;
                  }
              }
               if (count ==0)
               {
                   System.out.println("prime");
               }
               else 
               {
                   System.out.println("not prime");
               }
           }
  
   }
  }
