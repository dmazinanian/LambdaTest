package ca.concordia.lambda.test;

import java.util.ArrayList;
import java.util.List;

public class TestClass {
	public void testMethodA() {
		List<String> list = new ArrayList<>();
		list.forEach(item -> {
			System.out.println(item);
		});
	}
}
