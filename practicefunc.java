//WORKING ON VARIABLE ARGUMENTTS 
   //HERE WE CAN ENTER VARIABLE NO OF ARGUMENTS 
   // WE DONT KNOW HOW MANY INTEGERS WE ARE PASSING

import java.util.Arrays;

public class practicefunc {
    public static void main(String[] args) {
        func(1,2,3,4,5,6,7);
    }
  
    

    public static void func(int ...a){
        System.out.println(Arrays.toString(a));
    }

}

