package org.springframework.mytest;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class C7Cglib  implements MethodInterceptor {

	Object delegate;

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		return null;
	}
}
