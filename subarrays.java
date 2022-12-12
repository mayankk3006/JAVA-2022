import java.util.*;
public class subarrays {
    public static void subarray(int arr[]) {
        int maxsum=Integer.MIN_VALUE;
        int ts=0,sum=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                sum=0;
                for(int k=i;k<=j;k++){
                    System.out.print(arr[k]+" ");
                    sum=sum+arr[k];
                }
                System.out.println("\t sum of sub array is : "+sum);
                if(maxsum<sum){
                    maxsum=sum;
                }
                ts++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("TOTAL NUMBER OF SUBARRAYS : "+ts);
        System.out.println("maximum sum of all is : "+maxsum);
    }
    public static void main(String[] args) {
        int arr[]={-2,1,-3,4,-1,2,1,-5,4};
        subarray(arr);
    }
    
}



