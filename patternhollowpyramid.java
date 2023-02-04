public class patternhollowpyramid {
    public static void main(String[] args) {
        int n=7;
        for(int i=0;i<n;i++){
            for(int j=1;j<n-i;j++){
                System.out.print(" ");
            }
            
            
                for(int j=0;j<2*i+1;j++){
                    if(i==0||i==n-1||j==2*i||j==0){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
                
            }
            
            System.out.println();
        }
    }
    
}
