import java.util.*;

public class Main{

public static void main(String[] args) {
  // write your code here 
  Scanner scn = new Scanner(System.in);
  int n = scn.nextInt();
  int inv=0;
  int op = 1;
  while (n!=0)
  {
     int ofv = n%10;
     int ifv = op;
     int ip = ofv;
     
     inv = inv + ifv*((int)(Math.pow(10,ip-1)));
     op++;
     n = n/10;
  }
  System.out.println(inv);
 }
}
