package com.joongnior.pri.configuration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer //Spring Cloud Config Server 설정
public class PriConfigurationApplication {

	public static void main(String[] args) {
		SpringApplication.run(PriConfigurationApplication.class, args);
	}

}
