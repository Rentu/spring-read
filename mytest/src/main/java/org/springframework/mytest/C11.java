package org.springframework.mytest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class C11 {

	@Autowired
	C11(C2 c2){
		c2.say();
	}

	C11(){
		System.out.println("c11 no param construct");
	}
}
