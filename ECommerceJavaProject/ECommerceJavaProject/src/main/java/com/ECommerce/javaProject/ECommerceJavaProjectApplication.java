package com.ECommerce.javaProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;

@SpringBootApplication(exclude = HibernateJpaAutoConfiguration.class)
public class ECommerceJavaProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(ECommerceJavaProjectApplication.class, args);
	}

}
