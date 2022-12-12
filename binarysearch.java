import java.util.*;
public class binarysearch {
    public static void main(String[] args) {
        
        int arr[]={2,4,6,8,10};
        int find=10;
        System.out.println(binarysearch(arr,find));


    }

    public static int binarysearch(int arr[],int find){
        int start=0,end=arr.length-1;
        while(start<=end){
            int mid=(start+end)/2;

             
            if(arr[mid]==find){
                return mid;
            }
            if(arr[mid]<find){
                start=mid+1;
            
            }
            else{
                end=mid-1;
            }
            
        }
        return -1;
       
        

    }
    
}
