public class binarytodecimal {
    
        public static void main(String[] args) {
          
          // binary number input 
          String binary = "100001010101";
          
          // convert to decimal
          int decimal = Integer.parseInt(binary,2);
          System.out.println(binary + " in binary = " + decimal + " in decimal.");
        }
      }    

     