import java.util.*;
public class sttring {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int totallength=0;  
        String arr[]=new String[size];
        for(int i=0;i<arr.length;i++){
         arr[i]=sc.next();
         totallength +=arr[i].length();     
        }
        System.out.println(totallength);

        
    }
    
}
