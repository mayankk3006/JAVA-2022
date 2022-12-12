public class selectionsort {
    public static void main(String[] args) {
        int arr[]={1,6,4,9,15,0};

        //selection sort
        for(int i=0;i<arr.length-1;i++){
            int small=i;
            for(int j=i+1;j<arr.length;j++){
                 if(arr[small]>arr[j]){
                    small=j;
                 }
            }
            //swaping
            int temp=arr[small];
            arr[small]=arr[i];
            arr[i]=temp;

        }
        //printing sorted array 
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        
    
    
    
    }
    
}
