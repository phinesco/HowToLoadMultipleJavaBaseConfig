package com.richoco.howToLoadMultipleJavaBaseConfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringDemo {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext ctx =  new AnnotationConfigApplicationContext(MyAppConfig.class);
		MyJdbcService jdbc = (MyJdbcService) ctx.getBean("jdbcService");
		jdbc.createJdbcConnection();
		MyBusinessService business = (MyBusinessService) ctx.getBean("businessService");
		business.runMyBusiness();
		

	}

}
