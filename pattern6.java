public class pattern6 {
    public static void main(String[] args) {
      int n=6;
      int alpha=65;
      for(int i=n;i>0;i--){
        for(int j=0;j<i;j++){
        System.out.print((char)(alpha+j));
      }
      System.out.println();
    }

      for(int i=0;i<n;i++){
        for(int j=0;j<=i;j++){
        System.out.print((char)(alpha+j));
      }
      System.out.println();
    }

    }
    
}
