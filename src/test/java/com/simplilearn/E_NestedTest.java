package com.simplilearn;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@DisplayName("Nested Test Example")
@RunWith(JUnitPlatform.class)
public class E_NestedTest {

	@BeforeEach
	public void init() {
		System.out.println("Init on outer invoked");
	}
	
	@Nested
	class A {
		
		@BeforeEach
		public void init() {
			System.out.println("Init on inner invoked");
		}
		
		@Test
		@DisplayName("Test inside class A")
		public void test() {
			System.out.println(" Example test for class A");
		}
		
		@Test
		@DisplayName("Test inside class B")
		public void testB() {
			System.out.println(" Example test for class B");
		}
	}
}
