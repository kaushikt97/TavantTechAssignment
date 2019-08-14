package day1;

import java.util.Scanner;

public class Temperature {

	
	public double celsiusToFahrenheit(Double celsius)
	{
		return ((celsius*1.8)+32);
		
	}
	
	public  double fahrenheitToCelsius (Double Fahrenheit)
	{
		return ((Fahrenheit-32)*0.556);
		
	}
	
	public static void main(String[] args) {
		
		
		     System.out.println("press 1 for celsius to fahrenheit conversion" +"\n"+"OR"+"\n"+ "press 2 for fahrenheit to celsius coversion");
		     Scanner scanner=new Scanner(System.in);
             int choice=scanner.nextInt();
             System.out.println("Enter Temperature");
             Double temperatureValue=scanner.nextDouble();
             Double convertedTemperature;
             Temperature temperature=new Temperature();
               
             switch(choice)
             {
               case 1:{
            	        convertedTemperature=temperature.celsiusToFahrenheit(temperatureValue);
            	        System.out.println("Fahrenheit:"+convertedTemperature+" *F");
            	        break;
                       }
               case 2:{
            	        convertedTemperature=temperature.fahrenheitToCelsius(temperatureValue);
            	        System.out.println("Celcius:"+convertedTemperature+" *C");            	       
            	        break;
                       }
               
             }
             
             scanner.close();
	}

}
