package com.richoco.howToLoadMultipleJavaBaseConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class businessConfig {
	@Bean(name="businessService")
	public MyBusinessService getBusinessService() {
		return new MyBusinessService();
	}

}
