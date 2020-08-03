package org.springframework.mytest;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration("ConfigAlias")
@ComponentScan(value = "org.springframework.mytest")
public class Config {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(Config.class);
		C2 c2 = annotationConfigApplicationContext.getBean(C2.class);
		C2Controller c2Controller = annotationConfigApplicationContext.getBean(C2Controller.class);
		c2.say();
		c2Controller.say();
	}


}
