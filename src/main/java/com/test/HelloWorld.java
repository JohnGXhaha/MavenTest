package com.test;

import org.junit.Test;

public class HelloWorld {
	@Test
	public void say() {
		System.out.println("Hello World!");
	}

	public static void main(String[] args) {
		new HelloWorld().say();
	}
}
