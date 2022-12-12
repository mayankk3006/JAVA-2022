// public class kadans {
//     public static void kadans(int arr[]){
//        int ms=Integer.MIN_VALUE;
//         int cs=0;

//         for(int i=0;i<arr.length;i++){
//             cs=cs+arr[i];
//             if(cs<0){
//                 cs=0;
//             }
//             ms=Math.max(cs,ms);
//         }
//         System.out.println("our max subarray sum is :"+ ms);
//     }

//     public static void main(String[] args) {
//         int arr[]={-1};
//         kadans(arr);
//     }
    
// }


// public class kadans {
//     public static void kadans(int arr[]){
//        int ss=Integer.MAX_VALUE;
//         int cs=0;

//         for(int i=0;i<arr.length;i++){
//             cs=cs+arr[i];
            
//             ss=Math.min(cs,ss);
//         }
//         System.out.println("our min subarray sum is :"+ ss);
//     }

//     public static void main(String[] args) {
//         int arr[]={-4,-6,-12};
//         kadans(arr);
//     }
    
// }

public class kadans {
    public static int maxSubArray(int[] nums) {
        int n = nums.length;
        int max = Integer.MIN_VALUE, sum = 0;
        
        for(int i=0;i<n;i++){
            sum += nums[i];
            max = Math.max(sum,max);
            
            if(sum<0) sum = 0;
        }
        
        return max;
    }

        public static void main(String[] args) {
        int nums[]={-1};
        int s=maxSubArray(nums);
        System.out.println(s);
    }
}