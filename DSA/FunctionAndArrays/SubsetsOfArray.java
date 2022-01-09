import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
    //Input
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];
    for(int i = 0; i<arr.length;i++){
        arr[i]= scn.nextInt();
    }

    int limit = (int)Math.pow(2,arr.length);
    for(int i = 0; i<limit;i++){
        String set="";
        int t=i;
       //convert i to binary  and use 0 and 1 to determine whether to print or not

       for(int j = arr.length-1; j>=0;j--){
       int r= t%2;
       t=t/2;
        
        if(r==0){
                set = "-\t" +set;
        }
        else{
            set = arr[j] + "\t" +set;
        }
        }
        System.out.println(set);       
    }
 }

}
