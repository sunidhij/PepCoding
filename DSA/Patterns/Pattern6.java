import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here
        int n = scn.nextInt();;
         int ns = n/2 +1 ;
        int nsp = 1;
        for (int i = 1 ; i<= n ; i++)
        {
            //stars
            for (int cs = 0 ; cs < ns ; cs++)
            {
               System.out.print("*\t");
             
            }
            
            //spaces
            for (int csp = 0 ; csp <nsp ; csp++)
            {
               System.out.print("\t");
             
            }
            
            //stars
            for (int cs = 0 ; cs < ns ; cs++)
            {
               System.out.print("*\t");
             
            }
            System.out.println();
            
            if (i<=n/2)
            {
                nsp = nsp + 2;
                ns--;
            }
            else {
                nsp = nsp - 2;
                ns++;
            }
            
        }
        

    }
}
