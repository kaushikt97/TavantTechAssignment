package day1;

import java.util.Scanner;

public class SumOfNumbers {

	
	public  int  sumOfOddNumbers(int firstNumber,int secondNumber)
	{
		int sumOdd=0;
	for(int i=firstNumber;i<=secondNumber;i++)
	{
		if(i%2!=0)
			sumOdd=sumOdd+i;
	}
		return sumOdd;
	}
	
	public  int sumOfEvenNumbers(int firstNumber,int secondNumber)
	{

		int sumEven=0;
	for(int i=firstNumber;i<=secondNumber;i++)
	{
		if(i%2==0)
		sumEven=sumEven+i;
	}
		return sumEven;
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
		SumOfNumbers sumOfNumbers=new SumOfNumbers();
		 Scanner scanner=new Scanner(System.in);
         System.out.println("Enter First  Positive number");
         int firstNumber=scanner.nextInt();
         
         while(sumOfNumbers.validateNumber(firstNumber))
         {
        	 System.out.println("Number is invalid");
        	 System.out.println("Enter valid  First  number");
        	 firstNumber=scanner.nextInt();
         }
        
         System.out.println("Enter Second Positive number");
         int secondNumber=scanner.nextInt();
         
         
         while(sumOfNumbers.validateNumber(secondNumber))
         {
        	 System.out.println("Number is invalid");
        	 System.out.println("Enter valid Second  number");
        	 secondNumber=scanner.nextInt();
         }
         
         System.out.println("Sum Of Odd Numbers="+sumOfNumbers.sumOfOddNumbers(firstNumber,secondNumber));
   		 System.out.println("SumOf Even Numbers="+sumOfNumbers.sumOfEvenNumbers(firstNumber,secondNumber));
   		 scanner.close();	

	}

}
