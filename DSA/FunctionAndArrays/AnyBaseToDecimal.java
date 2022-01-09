import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int b = scn.nextInt();
      int dn = getValueInBase(n, b);
      System.out.println(dn);
      
   }
  
   public static int getValueInBase(int n, int b){
       // write code here
      int number = 0;
      int b2 = 1;
       while (n>0){
           int div = n/10;
           int r =n%10;
           number += r*b2;
           b2 *= b;
           n = n/10;
       }
   
       return number;
   }
  }
