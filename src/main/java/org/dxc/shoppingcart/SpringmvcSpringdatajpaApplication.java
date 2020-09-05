package org.dxc.shoppingcart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
@EnableJpaRepositories
@SpringBootApplication
public class SpringmvcSpringdatajpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringmvcSpringdatajpaApplication.class, args);
	}

	
}
