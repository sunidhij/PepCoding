import java.util.*;

public class Main{

    public static void main( String[] args)
    {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        String res ="";
        for(int i =0; i<str.length(); i++){ 
            char a =str.charAt(i);
            if ( a>= 65 && a<= 90){
                a += 32;
                res +=a;
            }
            else {
                a -= 32;
                res +=a;
            }

        }

        System.out.println(res);
    }
}
