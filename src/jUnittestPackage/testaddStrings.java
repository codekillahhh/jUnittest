package jUnittestPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testaddStrings {

	@Test
	public void test() {
		jUnitFunctions junitstring = new jUnitFunctions();
		String result = junitstring.addStrings("capstone", "project");
		assertEquals("capstoneproject", result);
	}

}
