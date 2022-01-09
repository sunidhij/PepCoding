import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here
        int n = scn.nextInt();
        
        int nsp = n/2;
        int ns = 1; //no of stars
        for (int i = 1 ; i<= n ; i++)
        {
            //spaces
            for (int csp = 0 ; csp <nsp ; csp++)
            {
               System.out.print("\t");
             
            }
            
            //stars
            for (int cs = 0 ; cs <ns ; cs++)
            {
               System.out.print("*\t");
             
            }
            System.out.println();
            
            if (i<=n/2)
            {
                ns = ns + 2;
                nsp--;
            }
            else {
                ns = ns -2;
                nsp++;
            }
            
        }

    }
}
