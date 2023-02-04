public static int slength(String str){
    if(str.length()==0){
        return 0;
    }
    return slength(str.substring(1));
}
public static void main(String[] args) {
    String str="a";
    int result=slength(str);
    System.out.println(result);
}