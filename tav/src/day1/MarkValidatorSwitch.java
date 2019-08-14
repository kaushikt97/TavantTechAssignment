package day1;

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
		     
		     
		     
		   
		
		public static void main(String args[])
		
		{
                        MarkValidatorSwitch markValidatorSwitch=new MarkValidatorSwitch();
			System.out.println(markValidatorSwitch.markGrade(76));
		}

	
}
