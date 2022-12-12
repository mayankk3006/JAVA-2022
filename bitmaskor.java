public class bitmaskor {
    public static void main(String[] args) {
        int n=5,pos=1,bitmask;

        bitmask=1<<pos;
       
        int newnumber=bitmask | n;
        System.out.println(newnumber);
    }
}

//bitmask set