public class fibonacci {
    public static void main(String[] args) {
        int a=0,b=1;
        int n=5;
        int c;
        System.out.println(a);
        System.out.println(b);
        for(int i=1;i<=n;i++){
            c=a+b;
            a=b;
            b=c;
            
            System.out.println(c);
        }
      
    }
    
}
