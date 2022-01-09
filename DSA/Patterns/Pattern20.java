import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here
        int n= scn.nextInt();
        
        for (int i = 1; i <=n; i++)
        {
            if(i<=n/2)
            {
               for(int j = 1; j<=n ;j++) {
                   if (j==1 || j==n)
                   {
                       System.out.print("*	");
                   }
                   else 
                   {
                       System.out.print("	");
                   }
               }
            }
            else 
            {
                for(int j = 1; j<=n ;j++) {
                   if (j==1 || j==n)
                   {
                       System.out.print("*	");
                   }
                   else 
                   {    
                       if ( i==j || i+j == n+1)
                       {
                       System.out.print("*	");
                       }
                       else 
                       {
                           System.out.print("	");
                       }
                   }
               }
            }
            System.out.println();
        }

    }
}
