/* 28. Java Program to find factorial of a number using Recursive Function*/

import java.util.Scanner;

public class Factorial
{
    private static Scanner sc;

    public static void main(String[] args) 
    {
        sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int num = sc.nextInt();
        
        if(num>=1) 
        {
           int factorial=findFactorial(num);
           System.out.println("The factorial of the given number is :"+factorial);
        }        
        else
        {
            System.out.println("Factorial cannot be determined.");
            System.out.println("Please enter a valid input.");
        } 
    }
    public static int findFactorial(int num)
    {
        if(num==0)
        return 1;
        else if(num==1)
        return 1;
        else
        return num*findFactorial(num-1);        
    }
}