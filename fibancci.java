import java.util.*;
public class fibancci {
public static void main(String[] args) {
    
    System.out.println("enter number");
    Scanner sc= new Scanner(System.in);
    int n=sc.nextInt();
     
    int a=0;
    int b=1;
    int c;
    System.out.print(a+ " " +b);
    for(int i=2;i<n;i++){
        c = a + b;
        System.out.print(" "+c);
        a = b;
        b =c;
    }
  } 
}