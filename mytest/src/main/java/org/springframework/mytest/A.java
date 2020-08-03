package org.springframework.mytest;

public class A {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void test() {
		System.out.println(name == null ? "没有name" : name);
	}
}
