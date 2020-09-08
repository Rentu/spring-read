package org.springframework.mytest;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class C2 {

	@Bean
	public void say(){
		System.out.println("hello world");
	}
}
