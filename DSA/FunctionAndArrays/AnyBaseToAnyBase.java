import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int b1 = scn.nextInt();
     int  b2 = scn.nextInt();
     int num1 = get1(n,b1);
     int num2 = get2(num1,b2);
     System.out.println(num2);
   }   
   
//function for any base to decimal
public static int get1(int n, int b){
       // write code here
      int number = 0;
      int mul = 1;
       while (n>0){
           int div = n/10;
           int r =n%10;
           number += r*mul;
           mul *= b;
           n = n/10;
       }
   
       return number;
   }
   //function for decimal to any base

    public static int get2(int n, int b){
       // write code here
      int number = 0;
      int mul = 1;
       while (n>0){
           int div = n/b;
           int r =n%b;
           number += r*mul;
           mul *= 10;
           n = n/b;
       }
   
       return number;
   }
   
   
  }
