import java.util.*;
public class maxminarray {
    public static void main(String[] args) {
        
    
    Scanner sc=new Scanner(System.in);
    int size=sc.nextInt();
    int number[]=new int[size];
    for(int i=0;i<size;i++){
        number[i]=sc.nextInt();
    }
        int max=number[0];
        int min=number[0];
    for(int i=0;i<number.length;i++){
        if(number[i]>max){
            max=number[i];
        }
    }
    for(int i=0;i<number.length;i++){
        if(number[i]<min){
            min=number[i];
        }
    }
    System.out.println("Largest number is : " + max);
    System.out.println("Smallest number is : " + min);
    }

    }
    

    

