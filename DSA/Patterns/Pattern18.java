import java.util.*;

public class Main{

public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

     // write ur code here
      int n = scn.nextInt();
     int ns = n ;
     int nsp = 0;
    
     for (int i = 1; i<=n;i++)
     {
          
             //spaces
                for (int csp = 1; csp<=nsp;csp++)
                 {
                     System.out.print("	");
                 }
                 
            //stars
                for (int cs = 1; cs<=ns;cs++)
                 {
                     if ((i>1 && i<=n/2 )&& (cs>1 && cs<ns))
                     {
                     System.out.print("	");
                     }
                     else 
                     {
                         System.out.print("*	");
                     }
                 }
                 
            if(i<=n/2)
            {
               ns = ns -2;
               nsp++;
            }
            else {
                ns = ns +2;
                nsp-- ;
            }
             System.out.println();    
         
         
     }

 }
}
