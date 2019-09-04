package day1;

import java.util.Scanner;

public class MarkValidatorSwitch {

	
	
		public  String markGrade(int mark)
		{
			String grade="Grade D";
		     switch (mark/10)
		     {
		     case 10:
		    	 
		     case 9:{grade="Grade A";
		              if(mark==90)
		            	  grade="Grade B";
		              break;
		            }		            	  
		    	 
		     case 8:grade="Grade B";
		             break;
		     
		     case 7:{if(mark>75)
		    	    grade="Grade B";
          		     else
          		     grade="Grade C";
		             break;
		             }
		    	 
		     case 6:{grade="Grade C";
                    if(mark==60)
           	           grade="Grade D";
                    break;
                    }		           
		    
	    }
			return grade;
		}     
		     
		     
		     
		public  boolean validateMarks(int marks)
		{
			if(marks<0)
			{
			 return true;
			}
			return false;
		}
		
		public static void main(String args[])
		
		{
            
			MarkValidatorSwitch markValidatorSwitch=new MarkValidatorSwitch();
			 Scanner scanner=new Scanner(System.in);
	         System.out.println("Enter Marks");
	         int marks=scanner.nextInt();
	         while(markValidatorSwitch.validateMarks(marks))
	         {
	        	 System.out.println("Marks is invalid");
	        	 System.out.println("Enter valid Marks");
	        	 marks=scanner.nextInt();
	         }
	         System.out.println(markValidatorSwitch.markGrade(marks));
	         scanner.close();
			
			

			
		}

	
}
