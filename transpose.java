import java.util.*;
public class transpose {
    public static void main(String[] args) {
        System.out.println("Enter array ");
        Scanner sc=new Scanner(System.in);
        int rows=sc.nextInt();
        int cols=sc.nextInt();
        int[][] arr=new int[rows][cols];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                arr[i][j]=sc.nextInt();

            }
            
        }
        System.out.println("transpose of matrix is ");
            for(int j=0;j<cols;j++){
                for(int i=0;i<rows;i++){
                    System.out.println(arr[i][j]+" ");
                }
            }
    

    }
    
}
