public class leapyear {
    public static void main(String[] args) {
        int y=2013;
        if(((y%4==0)&&(y%100!=0))||(y%400==0)){
            System.out.println("0"); 
        }
        else
        System.out.println("1");
    }
    
}
