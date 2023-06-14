package com.simplilearn;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
public class B_AssertionsTest {

	@Test
	public void assertTest() {
		
		String actual = "Some Value";
		String expected = "Some Value";
		
		Assertions.assertEquals(expected, actual);
		
		Assertions.assertTrue(5>0);
		Assertions.assertFalse(5<0);
		
		String[] a1 = {"A","B"};
		String[] a2 = {"A","B"};
		
		Assertions.assertArrayEquals(a1, a2);
		
		Assertions.assertThrows(RuntimeException.class, () -> {
			throw new RuntimeException();
		}
		);
		
		
		
	}
}
