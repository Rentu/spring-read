package org.springframework.mytest;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.concurrent.atomic.AtomicInteger;

@Component
public class C2 {
	public void say(){
		System.out.println("hello world c2");
	}
}
