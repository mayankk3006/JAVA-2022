public class pattern8 {
    public static void main(String[] args) {
        int alpha=65;
        
        for (int i = 0; i <=5; i++)
        {
            for (int j = 5; j >= i; j--)
            {
                System.out.print((char)(alpha +j));
            }
            System.out.println();
        }
    }
    
}
