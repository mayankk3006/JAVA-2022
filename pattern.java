public class pattern {
    public static void main(String[] args) {
        int n=5;
        int alpha=65;
        for(int i=0;i<n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
             for(int j=0;j<=i;j++){
                    System.out.print((char)(alpha+ j) +" ");
                }
                System.out.println();
                
            }
        
    }
    
}
