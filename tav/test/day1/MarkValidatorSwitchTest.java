package day1;

import static org.junit.Assert.*;

import org.junit.Test;

public class MarkValidatorSwitchTest {

	@Test
	public void markGradeTest() {
		MarkValidatorSwitch markValidatorSwitch=new MarkValidatorSwitch();
		String actual=markValidatorSwitch.markGrade(80);;
		String expected="Grade B";	
		assertEquals(expected, actual);
				}
	
}
