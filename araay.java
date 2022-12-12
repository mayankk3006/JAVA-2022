public class araay {
    public static void main(String[] args) {
        // int arr[]={1,2,3,4,5,6};
        // for(int i=0;i<arr.length;i++){
        //     arr[i]=arr[i]+1;
        // }
        // for(int i=0;i<arr.length;i++){
        //     System.out.print(arr[i]);
        // }
    //     String arr[]={"dosa","wada","sammbhar","samosa"};
    //     String find="samosa";
    //   find(arr,find);

    int num[]={2,5,4,8,99,76,12};
    
    largest(num);
    
       
        
    }
    


public static void find(String arr[], String find){
    for(int i=0;i<arr.length;i++){
        if(arr[i]==find){
            System.out.println(arr[i]+" "+"found at : " +" " + i);
        }
    
}
}

public static void largest(int arr[]){
    
    int largestt=Integer.MIN_VALUE;
    for(int i=0;i<arr.length;i++){
        if(arr[i]>largestt){
            largestt=arr[i];

        }
       
    }
    System.out.println(largestt);
}
}