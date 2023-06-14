package com.simplilearn;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;
import org.mockito.Mockito;

@DisplayName("Junit Repeated Test example")
@RunWith(JUnitPlatform.class)
public class F_RepeatedTest {

	Calculator calculator;
	RecordPublisher mockRecordPublisher = Mockito.mock(RecordPublisher.class);
	
	@BeforeEach
	void init() {
		calculator = new Calculator(mockRecordPublisher);
		Mockito.when(mockRecordPublisher.publish()).thenReturn(Boolean.TRUE);
	}
	
	
	@Test
	@RepeatedTest(1000)
	public void test() {
		Assertions.assertEquals(2, calculator.calculate(1, 1));
	}
}
