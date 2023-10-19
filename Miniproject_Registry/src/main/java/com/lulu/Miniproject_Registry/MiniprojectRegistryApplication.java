package com.lulu.Miniproject_Registry;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
@EnableEurekaServer
@SpringBootApplication
public class MiniprojectRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(MiniprojectRegistryApplication.class, args);
	}

}
