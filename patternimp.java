public class patternimp {
    public static void main(String[] args) {
        int n=5;
        
        int originaln=n;
        n=(n*2)-2;
        
        for(int row =0;row<=n;row++){
            for(int col=0; col<=n;col++){
                int x=originaln-(Math.min(Math.min(row,col),Math.min(n-row,n-col)));
                System.out.print(x+" ");
            }
            System.out.println();

        }
    }
    
}
