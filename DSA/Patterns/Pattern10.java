import java.util.*;

public class Main{

public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

     // write ur code here
     int n = scn.nextInt();
         int os= n/2;
         int is = -1;
         
     for ( int i = 1; i<=n; i++)
     {
     
      //Outer spaces
                     for ( int a = 1; a<= os; a++)
                 {
                     System.out.print("\t");
                 }
                 //stars 1
                 System.out.print("*\t");
                 //Inner spaces
                     for ( int a = 1; a<= is; a++)
                 {
                     System.out.print("\t");
                 }
                 if(i>1 && i<n)
                 {
                      System.out.print("*\t");
                 }
                 System.out.println();
                 
                 if (i <= n/2)
                 {
                     os = os - 1;
                     is = is +2;
                 }
                 else  {
                     os = os +1;
                     is = is - 2;
                 }
     
     }
 }
}
