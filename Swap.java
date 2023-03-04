/* 41. Java Program to swap two numbers without using a temporary variable*/

import java.util.Scanner; 

public class Swap
{
    private static Scanner sc;

	public static void main(String []args)
     {
        sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int num1=sc.nextInt();
        System.out.println("Enter the second number");
        int num2=sc.nextInt();
        num1=num1-num2;
        num2=num1+num2;
        num1=num2-num1;
        System.out.println("Numbers after swapping are: ");
        System.out.println("First Number is "+num1);
        System.out.println("Second Number is "+num2);
     }
}