package ca.concordia.lambda.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestClass {
	public void testMethodA() {
		List<String> list = new ArrayList<>();
		list.forEach(item -> {
			System.out.println(item);
		});
	}
	
	public void testMethodB() {
		Arrays.stream(new Double[]{}).allMatch(value -> value < 10);
	}
}
