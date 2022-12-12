import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
    int x, y, z;
    Scanner s = new Scanner(System.in);
    System.out.print("Enter the first number:");
    x = s.nextInt();
    System.out.print("Enter the second number:");
    y = s.nextInt();
    System.out.print("Enter the third number:");
    z = s.nextInt();
    int largest;
    if(x > y && x > z)
    {
        largest=x;
    }
    else if(y > z)
    {
        largest=y;
    }
    else
    {
        largest=z;
    }

    if((largest*largest)<((side1+side2+side3)*(side1+side2+side3))){
      System.out.println("1");
    }
     if((largest*largest)>((side1+side2+side3)*(side1+side2+side3))){
        System.out.println("3");
     }
       if((largest*largest)=((side1+side2+side3)*(side1+side2+side3))){
           System.out.println("1");
       }
	}
