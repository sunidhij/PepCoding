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
             
             
             // Part 1 
             if (i != n/2 +1)
             {
                 for ( int a =0;a< n/2; a++){
                 System.out.print("	");
                 }
             }
             else {
                for ( int a =0;a< n/2; a++){
                 System.out.print("*	");
                 }
             }
             
             
             //Part 2
               for (int cs = 1; cs<= ns ; cs++)
               {
                   System.out.print("*	");
                   
               }
              
                System.out.println();
                
               if( i<=n/2)
               {
                  
                   ns++;
               }
               
               else {
                   ns--;
                   
               }
               
            
            
           
        }
        


    }
}
