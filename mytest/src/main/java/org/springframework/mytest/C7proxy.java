package org.springframework.mytest;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 静态代理
 */
public class C7proxy implements InvocationHandler {

	C7 c7;

	Object delegate;

//	C7proxy(C7 c7){
//		this.c7 = c7;
//	}

	public void invoke(){
		System.out.println("before");
		this.c7.say();
		System.out.println("after");
	}

	public Object bind(Object delegate){
		this.delegate = delegate;
		return Proxy.newProxyInstance(delegate.getClass().getClassLoader(), delegate.getClass().getInterfaces(), this);
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("reflect before");
		method.invoke(delegate, args);
		System.out.println("reflect after");
		return null;
	}
}
