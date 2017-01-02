package ca.concordia.lambda.test;

import java.util.Arrays;

public class TestClass3 {
	public void testMethod() {
		Arrays.asList("Test1", "Test2").replaceAll(s1 -> s1.trim());
	}
}
