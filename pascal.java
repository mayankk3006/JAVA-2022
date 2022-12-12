public class pascal {
    public static void main(String[] args)
    {
       int n=5, i,num;
       for(i=0; i<n; i++)
       {
          for(int j=n; j>i; j--)
          {
             System.out.print(" ");
          }
          num=1; 
          for(int j=0; j<=i; j++)
          {
             System.out.print(num+ " ");
             num = num*(i-j)/(j+1);
          }
          System.out.print("\n");
       }
    }
 }
    
