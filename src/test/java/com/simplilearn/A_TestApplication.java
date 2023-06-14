package com.simplilearn;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
public class A_TestApplication {

	@BeforeAll
	static void initAll() {
		System.out.println("BeforeAll invoked");
	}

	@BeforeEach
	void initMe() {
		System.out.println("Before Each init()");
	}

	@Test
	void success() {
		System.out.println("This is your actual test case logic");
	}
	
	@Test
	void success1() {
		System.out.println("This is your actual test case logic1111");
	}

	@AfterEach
	void afterEach() {
		System.out.println("AfterEach method invoked");
	}

	@AfterAll
	static void destroyAll() {
		System.out.println("AfterAll invoked");
	}
}