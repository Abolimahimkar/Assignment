//Write a java program that take a year and print whether that year ia a leap year or not//


import java.util.Scanner;

public class Leap_year
 {
  public static void main(String[] args)
 {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a year: ");
    int a =2019;
    boolean isLeapYear;
    isLeapYear = (a % 4 == 0);
    isLeapYear = isLeapYear && (a % 100 != 0 || a % 400 == 0);

    if (isLeapYear) {
      System.out.println(a+ " is a leap year.");
    } else {
      System.out.println(a+ " is not a leap year.");
    }
  }
}
