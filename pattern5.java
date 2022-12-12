public class pattern5 {
    public static void main(String[] args) {
      int n=5;
      int alpha=65;
      for(int i=0;i<=n;i++){
        for(int j=0;j<=i;j++){
            System.out.print((char)(alpha+j));
        }
        System.out.println();
      }  
      for(int i=n-1;i>0;i--){
        for(int j=0;j<i;j++){
        System.out.print((char)(alpha+j));
      }
      System.out.println();
    }

    }
    
}
