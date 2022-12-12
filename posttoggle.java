import java.util.*;
public class posttoggle {
    public static void main(String[] args) {
          // Write a program to toggle a bit a position = “pos” in a number “n”.
    Scanner sc=new Scanner(System.in);
    int n=5;//0101.
    int pos=sc.nextInt();
    int bitmask=1<<pos;
    int newnumber=bitmask ^ n;
    System.out.println(newnumber);
    
            sc.close();
}
    }
    

