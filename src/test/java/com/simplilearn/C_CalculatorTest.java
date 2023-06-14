package com.simplilearn;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;
import org.mockito.Mockito;

@RunWith(JUnitPlatform.class)
@DisplayName("Calculator Tests")
public class C_CalculatorTest {

	Calculator calculator;
	RecordPublisher mockRecordPublisher = Mockito.mock(RecordPublisher.class);
	
	@BeforeEach
	void init() {
		calculator = new Calculator(mockRecordPublisher);
	}
	
	@Test
	public void testCalculateWhenPublishedFalse() {
		Mockito.when(mockRecordPublisher.publish()).thenReturn(Boolean.FALSE);
		Assertions.assertEquals(1, calculator.calculate(1, 1));
	}
	
	@Test
	@DisplayName("when both args are positive")
	public void testCalculateWhenBothArgsPositive() {
		Mockito.when(mockRecordPublisher.publish()).thenReturn(Boolean.TRUE);
		// STEP 1: Prepare Input
		int a = 1;
		int b = 1;
		
		// STEP 2: Invoke Method to get Acutal Output
		int actual = calculator.calculate(a, b);
		
		// STEP 3: Prepare Expected
		int expected = 2;
		
		// STEP 4: Assert actual and expected value
		Assertions.assertEquals(expected, actual);
	}
	
	@Test
	public void testCalculateWhenBothArgsNegative() {
		Mockito.when(mockRecordPublisher.publish()).thenReturn(Boolean.TRUE);
		// STEP 1: Prepare Input
		int a = -1;
		int b = -1;
		
		// STEP 2: Invoke Method to get Acutal Output
		int actual = calculator.calculate(a, b);
		
		// STEP 3: Prepare Expected
		int expected = -2;
		
		// STEP 4: Assert actual and expected value
		Assertions.assertEquals(expected, actual);
	}
	
	@Test
	public void testCalculateWhenOneIsNegativeAndOneIsPositive() {
		Mockito.when(mockRecordPublisher.publish()).thenReturn(Boolean.TRUE);
		// STEP 1: Prepare Input
		int a = -1;
		int b = 1;
		
		// STEP 2: Invoke Method to get Acutal Output
		int actual = calculator.calculate(a, b);
		
		// STEP 3: Prepare Expected
		int expected = 0;
		
		// STEP 4: Assert actual and expected value
		Assertions.assertEquals(expected, actual);
	}
}
