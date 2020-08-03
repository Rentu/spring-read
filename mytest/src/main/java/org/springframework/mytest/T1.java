package org.springframework.mytest;

import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class T1 {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext();
		// 将A注册到容器中
		ac.register(A.class);
		// 完成容器的启动刷新
		ac.refresh();
		A a = ac.getBean(A.class);
		a.test();

		// 容器启动后再向其中注册一个BeanDefinition
		DefaultListableBeanFactory beanFactory = ((DefaultListableBeanFactory) ac.getBeanFactory());
		BeanDefinition beanDefinition = beanFactory.getBeanDefinition("a");
		MutablePropertyValues propertyValues = beanDefinition.getPropertyValues();

		beanDefinition.getPropertyValues().add("name","bbb");
		beanFactory.registerBeanDefinition("b", beanDefinition);
		A b = ((A) beanFactory.getBean("b"));
		b.test();
	}
}
