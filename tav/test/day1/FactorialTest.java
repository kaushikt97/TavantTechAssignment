package day1;

import static org.junit.Assert.*;

import org.junit.Test;

public class FactorialTest {

	@Test
	public void factorialValueTest() {
	
		int number=5;
		Factorial factorial=new Factorial();
               int actual= factorial.calculateFactorial(number);
		int expected=120;
		assertEquals(expected,actual);
	}

}
