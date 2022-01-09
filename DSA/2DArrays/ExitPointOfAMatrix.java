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
    int dir=0; //0 is east,1 is south, 2 is west, 3 is north
    int i =0;
    int j= 0;
    while(true){
        dir = (dir +arr[i][j])%4;
        if(dir==0){ //east
            j++;
        }
        else if(dir==1){ //south
            i++;
        }
        else if(dir==2){//west
            j--;
        }
        else{//north
            i--;
        }
        if(i<0){
            i++;
            break;
        }
        else if(j<0){
            j++;
            break;
        }
        else if (i== arr.length){
            i--;
            break;
        }
        else if(j == arr[0].length){
            j--;
            break;
        }
    }

    System.out.println(i);
    System.out.println(j);
    }

}
