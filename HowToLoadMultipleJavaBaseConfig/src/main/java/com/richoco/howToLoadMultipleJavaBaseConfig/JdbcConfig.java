package com.richoco.howToLoadMultipleJavaBaseConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class JdbcConfig {
	
	@Bean(name = "jdbcService")
	public MyJdbcService getJdbcService() {
		return new MyJdbcService();
	}

}
