import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scn = new Scanner(System.in);

    int n= scn.nextInt();
    int[] a = new int [n];

    for (int i =0; i<n ;i++){
        a[i]= scn.nextInt();
    }
    int d= scn.nextInt();
  
  //Binary Search used

     int lo = 0;
     int high = a.length-1;
     int ceil = 0;
     int floor= 0;

    while(lo<=high)
    {
        int mid = (lo+high)/2;
            if (d<a[mid]){
                high = mid-1;
                ceil = a[mid];
            }
            else if (d>a[mid]){
                lo = mid+1;
                floor = a[mid];
            }
            else{
                floor = a[mid];
                ceil = a[mid];
                break;
            }
    }

    System.out.println(ceil);
     System.out.println(floor);

    

 }

}
