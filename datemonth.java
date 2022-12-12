public class datemonth {
    public static void date(int dd,int mm,int yy){
       
        
        if(mm%2==0){
            if(mm==2){
                if(dd>27){
                
                    mm++;dd=0;
                }
            }
            if(dd<=29){

                dd++;
            }
        
        else if(dd==30){
            dd=01; mm++;

         

        }
    }

        else{
            if(dd<=30){
                dd++; 
            }
            else if(dd==31){
                dd=01; mm++;
            }
        }

    
    System.out.print(dd+" "+mm+" "+yy);
}
public static void main(String[] args) {
    date(13,02,2001);
}
}

