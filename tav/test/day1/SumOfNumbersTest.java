package day1;

import static org.junit.Assert.*;

import org.junit.Test;

public class SumOfNumbersTest {

	@Test
	public void evenNumberTest() {
		SumOfNumbers sumOfNumbers=new SumOfNumbers();
		int actual= sumOfNumbers.sumOfEvenNumbers(1,6);
		int expected=12;
		assertEquals(expected,actual);
	}
	

	@Test
	public void oddNumberTest() {
		SumOfNumbers sumOfNumbers=new SumOfNumbers();
		int actual= sumOfNumbers.sumOfOddNumbers(1,6);
		int expected=9;
		assertEquals(expected,actual);
	}
	

}
