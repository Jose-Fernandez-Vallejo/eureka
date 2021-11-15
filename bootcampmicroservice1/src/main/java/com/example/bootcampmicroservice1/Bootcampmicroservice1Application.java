package com.example.bootcampmicroservice1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Bootcampmicroservice1Application {

	public static void main(String[] args) {
		SpringApplication.run(Bootcampmicroservice1Application.class, args);
	}

}
