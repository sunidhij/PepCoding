import java.util.*;

public class Main{

public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

     // write ur code here
     
     int n= scn.nextInt();
     int ns = 1;
         int nsp = 2*n-3;
     for (int i= 1; i<=n; i++)
     {
         int val = 1;
          //star 1
          for (int cs = 1; cs<= ns ; cs++){
              System.out.print(val + "	");
              val++;
          }
          //spaces
          for (int csp = 1; csp<= nsp ; csp++){
              System.out.print("	");
          }
          //star 2
          int cval = val -1;
          if (i<n){
          for (int cs = 1; cs<= ns ; cs++){
             
              System.out.print(cval + "	");
              cval--;
              
          }}
          else{
              cval = cval -1;
          for (int cs = 1; cs< ns ; cs++){
              
              System.out.print(cval + "	");
              cval--;
              
          }}
          
          System.out.println();
        
        ns++;
        nsp-=2;
         
     }

 }
}
