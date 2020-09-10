package org.springframework.mytest;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

@Component
public class MyPostBeanProcessor implements BeanPostProcessor {

	 @Override
	 public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
	 	if(beanName.equals("c2")){
			System.out.println("c2 before");
		}
	 	return bean;
	}


}
