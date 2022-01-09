import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
    // write your code here  
     Scanner scn = new Scanner(System.in);
    int a = scn.nextInt();
    int b = scn.nextInt();
    int c = scn.nextInt();
    if ( a>b && a>c)
    {
       int temp = c;
       c= a;
       a = temp;
    }
    else if (b>c && b>a)
    {
       int temp = c;
       c= b;
       b = temp;
    }
    
    if (c*c == a*a + b*b)
    {
        System.out.println("true");
    }
    else 
    {
         System.out.println("false");
    }
   
   }
  }
