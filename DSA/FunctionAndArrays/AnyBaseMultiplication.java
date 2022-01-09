import java.util.*;

public class Main{

public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int b = scn.nextInt();
    int n1 = scn.nextInt();
    int n2 = scn.nextInt();

    int d = getProduct(b, n1, n2);
    System.out.println(d);
 }

 public static int getProduct(int b, int n1, int n2){
     // write your code here
     int num =0;
     int mul =1;
        while(n2>0){
            int d2=n2%10;
            n2= n2/10;
            int prod1 = getProductSingleDigit(b, n1,d2);
            num = getSum(b,num,prod1*mul);
            mul  *=10;
        }
     return num;
  

 }

  public static int getProductSingleDigit(int b, int n1, int d2){

        int num = 0;
        int carry = 0;
        int mul = 1;
    
        while(n1>0 || carry>0)
        {
            int d1 = n1%10;
            n1=n1/10;
            int temp = d2*d1 + carry;
            carry = temp/b;
            temp = temp%b;
            num += temp*mul;
            mul*=10;
        }
        return num;
     
 }

public static int getSum(int b, int n1, int n2){
       
       // write ur code here
        int d1,d2,q,r;
      int mul =1;
      int temp = 0;
      int carry = 0;
      int result = 0;
       while (n1>0 ||n2>0 || carry>0)
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
       }
       return result;
   }
}
