package rs_maven.rs_maven;

import static org.junit.Assert.*;

import org.junit.Test;

public class Junit_for_OE {

	@Test
	public void test() {
		Even_Odd eo = new Even_Odd();
		assertEquals("Number is even", true,eo.is_even(4));
	}

	

}
