package jUnitTestingPackage;


import static org.junit.Assert.*;

import org.junit.Test;

public class testaddstrings {

	@Test
	public void test() {
		jUnitFunction junit = new jUnitFunction();
		String result = junit.addStrings("RAAKHAL", "RAPOLU");
		assertEquals("RAAKHALRAPOLU", result);
				
	}

}
