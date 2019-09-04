package day1;

import java.util.Scanner;

public class MarkValidator {
	
	public  boolean isPass(int mark)
	{
		if(mark>=40)
			return true;
		else 
			return false;
	}
	
	public  String markGrade(int mark)
	{
		if(isPass(mark))
		{
		 if(mark>90)
			 return "Grade A";
		 if(mark>75)
			  return "Grade B";
		 if(mark>60)
			  return "Grade c";
		}
	  return "Grade D"; 
	}
	
	public  boolean validateMarks(int marks)
	{
		if(marks<0)
		{
		 return true;
		}
		return false;
	}

	public static void main(String[] args) 
	{
		MarkValidator markValidator=new MarkValidator();
		 Scanner scanner=new Scanner(System.in);
         System.out.println("Enter Marks");
         int marks=scanner.nextInt();
         while(markValidator.validateMarks(marks))
         {
        	 System.out.println("Marks is invalid");
        	 System.out.println("Enter valid Marks");
        	 marks=scanner.nextInt();
         }
         System.out.println(markValidator.markGrade(marks));
         scanner.close();
		
		

	}

}
