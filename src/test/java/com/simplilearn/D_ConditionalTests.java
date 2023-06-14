package com.simplilearn;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledIf;
import org.junit.jupiter.api.condition.EnabledIf;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@DisplayName("Conditional Tests example")
@RunWith(JUnitPlatform.class)
public class D_ConditionalTests {

	@Test
	@EnabledOnOs({OS.WINDOWS})
	public void runOnWindows() {
		System.out.println("This runs on window");
	}
	
	@Test
	@EnabledOnOs({OS.LINUX})
	public void runOnLinux() {
		System.out.println("This runs on Linux");
		
	}
}
