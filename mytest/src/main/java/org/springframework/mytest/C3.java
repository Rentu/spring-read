package org.springframework.mytest;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

public class C3 {

	@Bean
	public void helloc3(){
		System.out.println("hello world c3");
	}

}
