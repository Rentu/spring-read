package org.springframework.mytest;

import org.springframework.stereotype.Component;

@Component
public class C5 {

	public C2 c2;

	/**
	 * 假设Bean显示定义了一个带参的构造函数，则需要同时提供一个默认无参的构造函数，否则使用属性注入时将抛出异常。
	 * 有无参构造走无参构造，有参构造的参数必须是个Bean 不然还走无参构造
	 * @param c2
	 */
	C5(C2 c2){
		this.c2 = c2;
		System.out.println("有参构造");
	}

	C5(){
		System.out.println("无参构造");
	}
}
