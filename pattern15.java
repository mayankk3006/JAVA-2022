import javax.sound.midi.Soundbank;

public class pattern15 {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=i;j<=n;j++){
                System.out.print("*");
            }
            for(int j=2;j<=i;j++){
                System.out.print(" ");
            }
            for(int j=2;j<=i;j++){
                System.out.print(" ");
            }
            for(int j=n;j>=i;j--){
                System.out.print("*");
        }
        
        System.out.println();
    }
    for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
        for(int j=i*2;j<=n*2-1;j++){
            System.out.print(" ");
        
    }
    for(int j=0;j<i;j++){
        System.out.print("*");
    }
    System.out.println();
    
}
}
}

// import java.util.Scanner;

// public class pattern15 {
//     public static void main(String[] args) {
//         Scanner s = new Scanner(System.in);

//         int n = s.nextInt();
//         print(n);
//     }

//     private static void print(int n) {

//         int i,j;
//         for(i=-n/2;i<=n/2;i++){
//             for(j=-n/2;j<=n/2;j++){
//                 if(Math.abs(i)+Math.abs(j)<n/2)
//                 System.out.println(" ");
//                 else
//                 System.out.println("*");
//             }
//             System.out.println();
//         }
//     }
// }