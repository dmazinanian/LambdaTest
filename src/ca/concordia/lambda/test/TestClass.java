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
		List<String> l = new ArrayList<>();
		l.forEach(s -> {
			System.out.println("Test");
		});
	}
	
	public void testMethodC() {
		List<String> l = new ArrayList<>();
		l.forEach(s -> {
			System.out.println("Test2");
		});
	}
	
	public void testMethodD() {
		List<String> l = new ArrayList<>();
		l.forEach(s -> {
			System.out.println("Test3");
		});
	}
	
	public void testMethodE() {
		List<String> l = new ArrayList<>();
		l.forEach(s -> {
			System.out.println("Test4");
		});
	}
	
	public void testMethodF() {
		List<String> l = new ArrayList<>();
		l.forEach(s -> {
			System.out.println("Test5");
		});
	}
}
