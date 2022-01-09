import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here
          int n = scn.nextInt();
        int nsp = n/2;
        int ns = 1;
        int val = 1;
        for (int i = 1; i<=n;i++)
        { 
             
               //spaces
               for (int csp = 0; csp< nsp ; csp++)
               {
                   System.out.print("	");
               }
               
               //val
               int cval = val;
               for (int cs = 1; cs<= ns ; cs++)
               {
                   System.out.print(cval + "	");
                   if (cs<= ns/2)
                   {
                       cval++;
                   }
                   else{
                       cval--;
                   }
                   
               }
              
                System.out.println();
                
               if( i<=n/2)
               {
                   nsp -= 1;
                   ns +=2;
                   val++;
               }
               else {
                   nsp++;
                   ns -=2;
                   val--;
               }
               
            
            
           
        }
        


    }
}
