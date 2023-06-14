package com.simplilearn;

public class Calculator {

	RecordPublisher recordPublisher;

	public Calculator(RecordPublisher recordPublisher) {
		this.recordPublisher = recordPublisher;
	}

	public int calculate(int a, int b) {
		boolean isPublished = recordPublisher.publish();
		if (isPublished) {
			return a + b;
		} else {
			return a * b;
		}
	}
}
