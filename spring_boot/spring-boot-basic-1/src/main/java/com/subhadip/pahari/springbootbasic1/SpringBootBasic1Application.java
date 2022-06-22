package com.subhadip.pahari.springbootbasic1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBootBasic1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = SpringApplication.run(SpringBootBasic1Application.class, args);

		SpringComponent component = applicationContext.getBean(SpringComponent.class);
		System.out.println(component.getMessage());
		System.out.println("server running ...");
	}

}
