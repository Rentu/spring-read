package org.springframework.mytest;

import org.springframework.beans.factory.annotation.Autowired;

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
