import java.util.*;

public class Main{
    public static void main(String[] args) {
        // write your code here
                 Scanner scn = new Scanner(System.in);

       int a = scn.nextInt();
         int b = scn.nextInt();
             for (int i = a ; i<=b; i++)
             {
                 int div = 0;
                 for ( int j = 2; j*j <= i ;j++)
                 {
                     if (i%j==0)
                     {
                        div = div + 1;
                     }
                    
                 }
                 if (div==0)
                 {
                     System.out.println(i);
                 }
                 
             }
    }
}
