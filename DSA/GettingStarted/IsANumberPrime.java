import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
  
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
