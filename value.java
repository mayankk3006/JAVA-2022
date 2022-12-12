// 
import java.util.*;



public class value {
    public static void main(String[] args) {
        

        int n = 5;
        print(n);
    }

    private static void print(int n) {

        int i,j;
        for(i=-n/2;i<=n/2;i++){
            for(j=-n/2;j<=n/2;j++){
                if(Math.abs(i)+Math.abs(j)<n/2)
                System.out.print(" ");
                else
                System.out.print("*");
            }
            System.out.println();
        }
    }
}