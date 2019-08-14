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
     public static boolean validateNumber(int number)
 	{
 		if(number<0)
 		{
 		 return true;
 		}
 		return false;
 	}
	public static void main(String[] args) 
	{
		
             Scanner scanner=new Scanner(System.in);
             System.out.println("Enter positive number");
             int number=scanner.nextInt();
             while(Factorial.validateNumber(number))
             {
            	 System.out.println("Number is invalid");
            	 System.out.println("Enter valid number");
            	 number=scanner.nextInt();
             }
		     Factorial factorial=new Factorial();  
             System.out.println("Factorial Value="+factorial.calculateFactorial(number));
             scanner.close();

	}

}
