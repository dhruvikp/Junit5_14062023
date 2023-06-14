package com.simplilearn;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.api.TestReporter;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
public class G_DependencyInjectionTest {

	@Test
	@Tag("Test1")
	@DisplayName("Test1")
	public void test(TestInfo testInfo, TestReporter testReporter) {
		String displayName = testInfo.getDisplayName();
		//testInfo.getTags();
		
		testReporter.publishEntry("displayName", displayName);
		
	}
	
}
