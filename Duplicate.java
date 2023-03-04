/* 13. Java Program to find duplicate characters in a string*/

import java.util.Scanner;

public class Duplicate
{  
    private static Scanner sc;

	public static void main(String[] args) 
     {  
        sc = new Scanner(System.in);  
        System.out.println("Enter string: ");
        String str1 = sc.next();
        
        int count;   
        char str[] = str1.toCharArray();            
        System.out.println("Duplicate characters in the given string: ");    
        
        for(int i=0; i<str.length; i++) 
        {  
            count = 1;
            for(int j=i+1; j<str.length; j++) 
            {  
                if(str[i]==str[j] && str[i]!=' ') 
                {  
                    count++;    
                    str[j]='0';  
                }  
            }    
            if(count>1 && str[i]!='0')  
            	{
                System.out.println(str[i]); 
                }  
        }  
    }  
}  