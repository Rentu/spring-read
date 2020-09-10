package org.springframework.mytest;

import org.springframework.context.annotation.*;

@Configuration("ConfigAlias")
@ComponentScan(value = "org.springframework.mytest", excludeFilters = {@ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, classes = C3.class)})
//@Import({org.springframework.mytest.C3.class})
public class Config {

	public static void main(String[] args) {
//		C7 c7 = new C7();
//		C7proxy c7proxy = new C7proxy(c7);
//		C7proxy c7proxy = new C7proxy();
//		C7i c7i = (C7i)c7proxy.bind(new C7());
//		c7i.say();
//		c7proxy.invoke();

//		c7proxy.invoke();
		AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(Config.class);
//		annotationConfigApplicationContext.getBean("c5");
//		annotationConfigApplicationContext.getBean("helloc3");
//		c3.helloc3();
//		C2 c2 = annotationConfigApplicationContext.getBean(C2.class);
//		C2Controller c2Controller = annotationConfigApplicationContext.getBean(C2Controller.class);
//		c2.say();
//		c2Controller.say();
	}


}
