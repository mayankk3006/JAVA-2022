public class clearbit {
    public static void main(String[] args) {
        int n=5,pos=2,bitmask;
        bitmask=1<<pos;
        int notbitmask=~bitmask;

        int newnumber=notbitmask & n;
        System.out.println(newnumber);
    }
    
}
