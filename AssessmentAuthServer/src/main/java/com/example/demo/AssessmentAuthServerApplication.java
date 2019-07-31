package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RestController;


@EnableEurekaClient
@RestController
@SpringBootApplication
public class AssessmentAuthServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(AssessmentAuthServerApplication.class, args);
	}

}
