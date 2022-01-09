import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scn = new Scanner(System.in);
    //Input n1 ands array a1
    int n1 = scn.nextInt();
    int[] a1 = new int[n1];
    for (int i = 0; i<a1.length; i++){
        a1[i] = scn.nextInt();
    }
    //Input n2 and array a2
    int n2 = scn.nextInt();
    int[] a2 = new int[n2];
     for (int i = 0; i<a2.length; i++){
        a2[i] = scn.nextInt();
    }
    //Result array a3
    int n3 = Math.max(n1,n2);
    int[] sum = new int[n3 +1];

    //Calculation
    int i1 = a1.length-1;
    int i2= a2.length-1;
    int i3= sum.length - 1;
    int carry = 0;
    int rem=0;
    while(i3>=0){
        int d1 = (i1>=0)? a1[i1] : 0;
          int d2 = (i2>=0)? a2[i2] : 0;
        int temp = carry + d1 + d2;
        int quest = temp/10;
        rem = temp%10;
        carry = quest;
        sum[i3] = rem;
        i3--;
        i1--;
        i2--;
    }
    //Removing leading zeroes
    int id = 0;
    while(sum[id]==0){
        id++;
    }
    //Printing Numbers
    for (int i = id; i<sum.length; i++){
        System.out.println(sum[i]);
    }
 }

}
