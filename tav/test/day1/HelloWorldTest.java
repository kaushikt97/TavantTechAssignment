package day1;

import static org.junit.Assert.*;

import org.junit.Test;

public class HelloWorldTest {

	@Test
	public void helloWorldTest() {
		HelloWorld2 helloWorld2=new HelloWorld2(); 
			String actual=helloWorld2.getMessage();
			String expected="Hello world!";	
			assertEquals(expected, actual);
					}

}
