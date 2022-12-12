import java.util.*;
public class findxarr {
    public static void main(String[] args) {
        System.out.println("enter array");
        Scanner sc=new Scanner(System.in);
        int rows=sc.nextInt();
        int cols=sc.nextInt();
        System.out.println("enter the number to find");
        int x=sc.nextInt();
        int[][] arr=new int[rows][cols];
         
            for(int i=0;i<rows;i++){
                for(int j=0;j<cols;j++){
                   arr[i][j]=sc.nextInt();
                }
            }

            for(int i=0;i<rows;i++){
                for(int j=0;j<cols;j++){
                    if(arr[i][j]==x){
                        System.out.println("number found");
                    }
                    
                }
            }
    }
    
}

