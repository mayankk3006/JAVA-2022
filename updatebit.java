import java.util.Scanner;

public class updatebit {
    public static void main(String[] args) {
       /* for 0 

        bitmask : 1<<i
        operation : bitwise and with not 
        it is same as clear bit  */

        /*
         
        FOR 1
        BITMASK :1<<i
        operation : or
        it is same as set bit
         */
        System.out.println("enter operation to perform 1 or 0");
        Scanner sc= new Scanner(System.in);
        int oper=sc.nextInt();
        if(oper==0){
         int n=5,pos=2,bitmask;
         bitmask=1<<pos;
         int notbitmask=~bitmask;
         int newnumber=notbitmask & n;
         System.out.println(newnumber);

    }

    else{
        int n=5,pos=2,bitmask;
        bitmask=1<<pos;
        int newnumber=bitmask | n;
        System.out.println(newnumber);
    }
    
}
}
