package day1;

import static org.junit.Assert.*;

import org.junit.Test;

public class MarkValidatorTest {

	@Test
	public void isPassTest() {
		MarkValidator markValidator=new MarkValidator();
		boolean actual=markValidator.isPass(40);
		boolean expected=true;	
		assertEquals(expected,actual);
		}
	
	
	@Test
	public void markGradeTest() {
		MarkValidator markValidator=new MarkValidator();
		String actual=markValidator.markGrade(80);;
		String expected="Grade B";	
		assertEquals(expected, actual);
				}
	
	

}
