// write a java program that get a number and print whether it is positive or negative//
  
 import java.util.Scanner;
 public class number{
 public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        int a = -5;

        if (a > 0)
        {
            System.out.println( "Number is positive");
        }
        else if (a < 0)
        {
            System.out.println( "Number is negative");
        }
        else
        {
            System.out.println("Number is zero");
        }
    }
}
