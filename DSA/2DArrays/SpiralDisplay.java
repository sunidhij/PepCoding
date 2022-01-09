import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
     Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int m = scn.nextInt();
    int[][] arr = new int [n][m];

    for(int i = 0; i<arr.length;i++){
        for(int j = 0;j<arr[0].length;j++){
            arr[i][j] = scn.nextInt();
        }
    }

    int minr= 0;
    int minc=0;
    int maxr = arr.length-1;
    int maxc= arr[0].length- 1;
    int num = m*n;
    int counter=0;
    while(counter<num){
        //left wall
        for(int i =minr, j = minc; i<=maxr && counter<num; i++){
            System.out.println(arr[i][j]);
            counter++;
        }
        minc++;
        //bottom wall
        for(int i =maxr, j = minc; j<=maxc && counter<num; j++){
            System.out.println(arr[i][j]);
            counter++;
        }
        maxr--;
        //right wall
        for(int i =maxr, j = maxc; i>=minr && counter<num; i--){
            System.out.println(arr[i][j]);
            counter++;
        }
        maxc--;
        //top wall
        for(int i =minr, j = maxc; j>=minc  && counter<num; j--){
            System.out.println(arr[i][j]);
            counter++;
        }
        minr++;

    }

    }

}
