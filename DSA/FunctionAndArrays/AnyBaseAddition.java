import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int b = scn.nextInt();
      int n1 = scn.nextInt();
      int n2 = scn.nextInt();
     
  
      int d = getSum(b, n1, n2);
      System.out.println(d);
   }
  
   public static int getSum(int b, int n1, int n2){
       
       // write ur code here
       int d1,d2,q,r;
      int mul =1;
      int temp = 0;
      int carry = 0;
      int result = 0;
       while (true)
       {
           d1 = n1%10;
           d2=  n2%10;
           temp = carry + d1 + d2;
           n1 = n1/10;
           n2 = n2/10;
           q = temp/b;
           r = temp%b;
           result += r*mul;
           carry = q;
           mul*=10;
           if(temp<=0)
           {
               break;
           }
       }
       return result;
   }
  }
