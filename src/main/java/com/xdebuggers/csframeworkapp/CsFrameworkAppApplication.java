package com.xdebuggers.csframeworkapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.xdebuggers.core.cache.EnableCSCache;
import com.xdebuggers.core.datasource.EnableCSDataSource;
import com.xdebuggers.core.email.EnableCSEmail;

@EnableCSCache
@EnableCSDataSource
@EnableCSEmail
@SpringBootApplication
public class CsFrameworkAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(CsFrameworkAppApplication.class, args);
	}

}
