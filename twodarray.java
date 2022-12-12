import java.util.*;
public class twodarray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter rows and column");
        
        int rows=sc.nextInt();

        int cols=sc.nextInt();
        
       

        int [][] arr=new int[rows][cols];


        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                arr[i][j]=sc.nextInt();

            }
        }

        System.out.println("enter numer to find");
        
        int x=sc.nextInt();
        
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(arr[i][j]==x){
                    System.out.println("number found at"+ i + j);
                }
                
                }
            }
        }
    }

    

