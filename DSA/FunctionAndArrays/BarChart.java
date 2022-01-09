import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int [n];
    for (int b = 0; b<n;b++)
    {
        arr[b]= scn.nextInt();
    }
    int totalcol = n;
    int totalrows = max(arr);
    for (int i = totalrows -1; i>=0;i--)
    {
            for (int j = 0; j<totalcol;j++)
        {
            if (i < arr[j] )
            {
                System.out.print("*\t");
            }
            else  {
                System.out.print("\t");
            }
        }
        System.out.println();
    }
 }

    public static int max (int[] arr){
        int a = Integer.MIN_VALUE;
        for (int i = 0; i<arr.length;i++)
    {
        if (arr[i] > a){
        a = arr[i];
        }
    }
    return a;
    }
}
