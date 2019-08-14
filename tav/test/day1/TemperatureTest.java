package day1;

import static org.junit.Assert.*;

import org.junit.Test;

public class TemperatureTest {

	@Test
	public void testCelciusToFahrenheit() {
		Temperature temperature=new Temperature();
		double celsiusTemp=35;
        int actual=(int)temperature.celsiusToFahrenheit(celsiusTemp);
		int expected=95;
		assertEquals(expected,actual);
	}

	@Test
	public void testFahrenheitToCelsius() {

		Temperature temperature=new Temperature();
		double fahrenheitTemp=95;
        int actual=(int)temperature.fahrenheitToCelsius(fahrenheitTemp);
		int expected=35;
		assertEquals(expected, actual);
	}
	}


