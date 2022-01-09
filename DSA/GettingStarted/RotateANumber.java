import java.util.*;
   
   public class Main{
   
   public static void main(String[] args) {
     // write your code here  
      Scanner scn = new Scanner(System.in);
     int n = scn.nextInt();
     int k = scn.nextInt();
    
    int v1;
    int v2;
    int m=n;
    int count =0;
    //Counting the number of digits
    while(m!=0){
        m =m/10;
        count++;
    }
     //Getting Value of K
     k = k%count; ;
     if (k<0)
     {
         k = k + count ;  // k+count because it will be the same if the value is negative
     }
     
    v1 = n/((int)Math.pow(10,k));
    v2 =  n%((int)Math.pow(10,k));
    int r = v2*((int)Math.pow(10,count -k)) + v1;
    System.out.print(r);
    }
   }
