package day1;

import java.util.Scanner;

public class Factorial {
	
	
     public  int calculateFactorial(int number)
     {
    
    	 int fact =1;
    	 for(int i=number;i>=1;i--)
    		 fact=fact*i;
    	 
    	 return fact;
     }
     public  boolean validateNumber(int number)
 	{
 		if(number<0)
 		{
 		 return true;
 		}
 		return false;
 	}
	public static void main(String[] args) 
	{
		 Factorial factorial=new Factorial();  
             Scanner scanner=new Scanner(System.in);
             System.out.println("Enter positive number");
             int number=scanner.nextInt();
             while(factorial.validateNumber(number))
             {
            	 System.out.println("Number is invalid");
            	 System.out.println("Enter valid number");
            	 number=scanner.nextInt();
             }
		    
             System.out.println("Factorial Value="+factorial.calculateFactorial(number));
             scanner.close();

	}

}
