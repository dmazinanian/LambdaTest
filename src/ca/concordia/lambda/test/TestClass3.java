package ca.concordia.lambda.test;

import java.util.Arrays;

public class TestClass3 {
	public void testMethod() {
		Arrays.asList("Test1", "Test2").replaceAll(s1 -> s1.trim());
	}
	
	public void testMethod2() {
		Arrays.asList("Test1", "Test2").replaceAll(s1 -> s1.trim());
		Arrays.asList("Test1", "Test2").replaceAll(s2 -> s2.trim());
	}
	
	public void testMethod3() {
		Arrays.asList("Test1", "Test2").replaceAll(s1 -> s1.trim());
		Arrays.asList("Test1", "Test2").replaceAll(s2 -> s2.trim());
	}
	
	public void testMethod4() {
		Arrays.asList("Test1", "Test4").replaceAll(s1 -> s1.trim());
		Arrays.asList("Test1", "Test4").replaceAll(s2 -> s2.trim());
	}
	
}
