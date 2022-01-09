import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        //write your code here
        int n = scn.nextInt();
        int m= 1;
        
        for (int i = 0; i<n; i++)
        {
            m = 1;
             for (int j = 0; j<=i; j++)
                    {
                        
                         System.out.print(m +"	");
                         int m1 = m*(i-j)/(j+1);
                         m = m1;
    
                        
                    }
            System.out.println();
        }

    }
}
