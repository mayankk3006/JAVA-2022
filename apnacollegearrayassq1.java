public class apnacollegearrayassq1 {
    public static boolean check(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                 return true;
                }
                
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4};
       boolean value= check(arr);
       System.out.println(value);
    }
    
}
