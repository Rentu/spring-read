package org.springframework.mytest;

import org.springframework.beans.factory.annotation.Autowired;

public class C7 implements C7i{

	@Override
	public void say(){
		System.out.println("say test");
	}

}
