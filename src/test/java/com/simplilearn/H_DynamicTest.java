package com.simplilearn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;
import org.mockito.Mockito;

@DisplayName("Dynamic Test")
@RunWith(JUnitPlatform.class)
public class H_DynamicTest {
	Calculator c;
	RecordPublisher mockRecordPublisher = Mockito.mock(RecordPublisher.class);
	
	@BeforeEach
	void init() {
		c = new Calculator(mockRecordPublisher);
		Mockito.when(mockRecordPublisher.publish()).thenReturn(Boolean.TRUE);
	}
	
	
	@TestFactory
	Collection<DynamicTest> dynamicTests() {
		Collection<DynamicTest> tests = new ArrayList<>();
		tests.add(DynamicTest.dynamicTest("both arguments positive", ()-> { Assertions.assertEquals(2, c.calculate(1, 1)); } ));
		tests.add(DynamicTest.dynamicTest("one positive and one negative", ()-> { Assertions.assertEquals(0, c.calculate(1, -1)); } ));
		tests.add(DynamicTest.dynamicTest("both arguments negative", ()-> { Assertions.assertEquals(-2, c.calculate(-1, -1)); } ));
		tests.add(DynamicTest.dynamicTest("both arguments zero", ()-> { Assertions.assertEquals(0, c.calculate(0, 0)); } ));
		return tests;
	}

}
